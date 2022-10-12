# imports
import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns
from sklearn.preprocessing import StandardScaler
from sklearn.preprocessing import RobustScaler
from sklearn.pipeline import Pipeline
import local

local.clearterminal()

# assign boston_df to the boston.csv file read using pandas
boston_df = pd.read_csv( '2-Scikit-p1/data/boston.csv' )

# head and describe are ways of looking at information, and can be printed out
print(boston_df.head())
print(boston_df.describe())

# creates a new version of the data which is melted ready to plot
data_melted = pd.melt(boston_df)

# using matplotlib and seaborn, the data is plotted as a box plot and label assigned
fig, ax = plt.subplots()
ax = sns.boxplot(x="variable", y="value", data=data_melted)
ax.set_xlabel(" ")
ax.set_ylabel("MEDV")

# the output can be shown using plt.show() - however, this will call all plots so 
# to avoid repetition will just be called once at the end

# the scikit standard scaler is assigned to scaler
scaler = StandardScaler()

# however, we don't want to perform any pre-processing on the target variable (MEDV) so we must create a new variable
# of the dataset with MEDV dropped first
x = boston_df.drop(['MEDV'], axis=1)
y = boston_df['MEDV']

# data is fitted to the scaler and then transformed
# scaler.fit(x) and X_scaled = scaler.transform(x) 
# can be used, or it can be done in one line with
X_scaled = scaler.fit_transform(x)

# parse the output to make it more human readable and return it
df_scaled = pd.DataFrame(X_scaled, columns=list(x))

# check the distribution of the scaled data using the same boxplot process as before
scaled_data_melted = pd.melt(df_scaled)
fig, ax = plt.subplots()
ax = sns.boxplot(x="variable", y="value", data=scaled_data_melted)
ax.set_xlabel(" ")
ax.set_ylabel("MEDV")

# lastly, using the Pipeline object from scikit we can complete this process
# as one function with a series of steps defined, as demonstrated below

# create variable transformer which is a Pipeline with two steps defined (standard scale then robust scale)
transformer = Pipeline(
    [
        ('scaler', StandardScaler()),
        ('robust', RobustScaler())
    ]
)

# fit the data using the transformer variable
transformer.fit(x)

# use pd to create a human-readable output, also prefacing the transform() function with our new
# transformer variable
df_transformed = pd.DataFrame(transformer.transform(x), columns=list(x))

# then print this new variable head with the old to compare - the additional robust scaling
# with transformer means the results should look different
print(df_transformed.head())
print(df_scaled.head())

# we can also then turn this into a box plot to look at the variation of the pipeline-transformed data
transformed_data_melted = pd.melt(df_transformed)
fig, ax = plt.subplots()
ax = sns.boxplot(x="variable", y="value", data=transformed_data_melted)
ax.set_xlabel(" ")
ax.set_ylabel("MEDV")

# show all plots created (commented out)
plt.show()