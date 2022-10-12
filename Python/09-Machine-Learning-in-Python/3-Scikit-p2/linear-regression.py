import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import local as lo
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
from sklearn.metrics import mean_squared_error
from sklearn.model_selection import cross_val_score

lo.clearterminal() # clear terminal everytime script is run

df = pd.read_csv( '3-scikit-p2/data/boston.csv' )
train_df, test_df = train_test_split(df, test_size=0.2, random_state=42)
print(df.shape, train_df.shape, test_df.shape) # print size of sets to confirm split

# or you can further split by target variables
X = df.drop(['MEDV'], axis=1)
Y = df['MEDV']
X_train, X_test, Y_train, Y_test = train_test_split(X, Y, test_size=0.2, random_state=42)
print(X_train.shape, X_test.shape, Y_train.shape, Y_test.shape) # confirm split

# Linear Regression is used to produce an R^2 value from the training data
# Firstly, the data is fit, and then it is scored
reg_all = LinearRegression()
reg_model = reg_all.fit(X_train, Y_train)
r_sq = round(reg_all.score(X_train, Y_train), 4)
print(r_sq)

# From here, we can then call the predict method to see how well it performs on the test data
Y_pred = reg_all.predict(X_test)
r_sq_test = round(reg_all.score(X_test, Y_test), 4)
print(r_sq_test)

# We can compare the Y_pred and the r^2 for our test values and assess the mean squared error
Y_mse = round(np.sqrt(mean_squared_error(Y_test, Y_pred)), 4)
print(Y_mse)

# or by using numpy as below
error = Y_test - Y_pred
Y_err = round(np.sqrt(np.mean(error ** 2)), 4)
print(Y_err)

# it is important to understand the distribution of error as well, beginning with creating a plot
fig, ax = plt.subplots()
ax.hist(error)
ax.set_xlabel('Error')
print("Figure_1 previously generated: see figures")

# and then exploring other comparrisons
pred_df = pd.DataFrame({'Actual value': Y_test, 'Predicted value': Y_pred}).reset_index(drop=True)
head_df = pred_df.head(10).plot(kind='bar')
print("Figure_2 previously generated: see figures")
tail_df = pred_df.tail(10).plot(kind='bar')
print("Figure_3 previously generated: see figures")

# although a scatterplot can be used to provide the most valuable insight
fig, ax = plt.subplots(figsize=(10, 8))
ax.scatter(Y_test, Y_pred)
ax.plot([0,50], [0,50], linestyle='--')
ax.set_xlabel('Actual Value')
ax.set_ylabel('Predicted Value')
print("Figure_4 previously generated: see figures")

# however, the way the data was split can determine how accurate the model is
# no good model should be dependant on the split, and so cross-val is used
# this is also referred to as K-folds, where data is run through multiple
# splits, each unique, and the process run for each. at the end, the average
# performance across all folds is taken
cv_scores = cross_val_score(reg_all, X_train, Y_train, cv=10)
print(cv_scores) # array of r^2 score for 10 different regressions at 10 different folds

rsq = cv_scores.mean()
print(rsq) # the mean across the 10 r^2 scores

# we can also compare how much impact the cv value (folds) influences the output
metrics_df = pd.DataFrame()
for elem in [5, 8, 10, 15, 20]:
    cv_scores = cross_val_score(reg_all, X_train, Y_train, cv=elem)
    temp_df = pd.DataFrame()
    temp_df['cv'] = [elem]
    temp_df['avg_score'] = [cv_scores.mean()]
    metrics_df = metrics_df.append(temp_df).reset_index(drop=True)
print(metrics_df)