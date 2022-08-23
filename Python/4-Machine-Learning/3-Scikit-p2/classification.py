import pandas as pd
import numpy as np
import matplotlib.pyplot as plt

from sklearn.linear_model import LogisticRegression
from sklearn.model_selection import GridSearchCV
from sklearn.model_selection import train_test_split
from sklearn.metrics import confusion_matrix
from sklearn.metrics import classification_report

import local as lo

#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#

lo.clearterminal()
lo.no_convergewarning()

#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#

# usual procedure to read and split data
df = pd.read_csv( '3-Scikit-p2/data/diabetes.csv' )
x = df.drop(['diabetes'], axis=1)
y = df['diabetes']
x_train, x_test, y_train, y_test = train_test_split(x, y, test_size=0.2, random_state=42)

# using logistic regression with a max iterations of 10,000 fit the model and return y_pred
lr = LogisticRegression(max_iter=10000)
lr.fit(x_train, y_train)
y_pred = lr.predict(x_test)
print(y_pred[0]) # here we have also printed the target variable for the datum at index 0 in the array

# from the data, you can pull the variables (excl target) from any array index - in this case iloc[0]
print(x_test.iloc[0])

# to show how these variables give the target value it does (in this case 0) the coef_ and intercept_ 
# can be included. for this example, the output is -0.966 and under logistic regression negatoive values
# form the negative class (0)
print(lr.coef_ @ x_test.iloc[0] + lr.intercept_ )

# we can repeat this for any datum in the array to see the result, the variables, and the coeficient
print("\nAt index 9, we predicted a value of", y_pred[9])
y9_vars = x_test.iloc[9]
y9_coef = lr.coef_ @ x_test.iloc[9] + lr.intercept_
print("\nThe values of the other variables for this datum are as follows:\n{}".format(y9_vars))
print("\nAnd the coefficient is", y9_coef)

# additionally, the raw probabilities can also be called to further explore the data
y_pred_prob = lr.predict_proba(x_test)

# the left value represents the probability it belongs to the negative class, 
# the right being the probability it belongs to the positive
print(y_pred_prob)

# further params can be added to the logistic regression function, including:
# C - regularization (by default L2 like in normalization)
# penalty - also by default L2
# from here, you can then use grid search as with previous by creating spaces & logspaces

# define parameters for c (c_space) and penality (L1/L2) using param_grid
c_space = np.logspace(-5, 8, 15)
logreg = LogisticRegression()
param_grid = {'C': c_space}

# pass the logreg and param_grid into cross-var search with 5 folds and continue usual fitting
logreg_Xvar = GridSearchCV(logreg, param_grid, cv=5)
logreg_Xvar.fit(x_train, y_train)

# as before, we can access the best params and best score from the space we asked it to test
best_params = logreg_Xvar.best_params_
best_score = round(logreg_Xvar.best_score_, 3)
print(best_params)
print(best_score)

# lastly, we can take the best estimator attirubte and store it as the best model and then predict with it
best_model = logreg_Xvar.best_estimator_
print(best_model)
y_preds = best_model.predict(x_test)
print(y_preds)

# we can now use different methods to evaluate our models, starting with the confusion matrix
# the confusion matrix takes params y_test and y_preds and produces a matrix
# top left is a true positive (predicted positive, was positive)
# top right a false positive (predicted positive, was negative)
# bottom left is a false negative (predicted negative, was positive)
# bottom right is a true negative (predicted negative, was negative)
# the values tell you the number of instances of that outcome - ideally we want higher true positive
# and true negative numbers compared to false positive and false negative
conf_mat = confusion_matrix(y_test, y_preds)
print(conf_mat)

# we can then use the classification report to pull further info from the matrix
report = classification_report(y_test, y_preds)
print(report)