import pandas as pd
import numpy as np
import matplotlib.pyplot as plt

from sklearn.model_selection import train_test_split
from sklearn.linear_model import Ridge
from sklearn.preprocessing import StandardScaler
from sklearn.pipeline import make_pipeline
from sklearn.model_selection import GridSearchCV

import local as lo

#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#

lo.clearterminal()
lo.no_futurewarning()

#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#

# follow the usual process of reading the CSV file, dropping the MEDV (target) variable prior to transformation,
# and splitting the data ready for training
df = pd.read_csv( '3-Scikit-p2/data/boston.csv' )
x = df.drop(['MEDV'], axis=1)
y = df['MEDV']
x_train, x_test, y_train, y_test = train_test_split(x, y, test_size=0.2, random_state=42)

# create a new pipeline* which 1) scales the data using a standard scaler, and 2) applies the Ridge model. This can
# then be fitted to the training data and our y_pred, and r^2 scores for training and test data found
ridge = make_pipeline(StandardScaler(with_mean=False), Ridge())
ridge.fit(x_train, y_train)
y_pred = ridge.predict(x_test)
r2_score = round(ridge.score(x_train, y_train), 4)
r2_test = round(ridge.score(x_test, y_test), 4)
print(r2_score)
print(r2_test)

# you can use Ridge further to work out how much alpha might affect your r^2 output
# tell Ridge to normalize the data* and set a logspace (range) of alpha values, as well as a number
# of total alpha values to test (-3 to 3, and 10)
ridge_dep = Ridge(normalize=True)
alphas = np.logspace(-3,3,10)
coef=[]

# Ridge will start the for-loop and test the success of the model using each alpha, adding the result
# to array 'coef' and showing each of the possible r^2 values as the alpha changes
for a in alphas:
    ridge_dep.set_params(alpha=a)
    ridge_dep.fit(x_train, y_train)
    coef.append(ridge_dep.coef_)

# next, create a plot which shows this process
# the xscale can just be log (as logspace was used), and markers is handy so you can view the
# specific alpha values tested along each line
fig, ax = plt.subplots()
ax.plot(alphas, coef, marker='*')
ax.set_xlabel('alpha')
ax.set_ylabel('Regression Coef')
ax.set_xscale('log')
ax.set_xlim(ax.get_xlim())

# you can take advantage of the alpha affect using cross-variance with an array of alphas then fitting the 
# training data to that
param_grid = {'alpha': np.logspace(-3, 3, 10)}
grid = GridSearchCV(ridge_dep, param_grid, cv=10, return_train_score=True)
grid.fit(x_train, y_train)

# after the fit is complete, you can easily pull the best r^2 and the best alpha value (least variance/best 
# # predictability)
best_score = round(grid.best_score_, 4)
best_param = grid.best_params_
print(best_score)
print(best_param)


# *the first function was originally recommended to be done using matplotlib's Ridge function, however this is 
# deprecated so the pipeline was used instead. in the next part, the normalize function (substituted for 
# StandardScaler in the Pipelin) is used and the deprecation warnings have been surpresed