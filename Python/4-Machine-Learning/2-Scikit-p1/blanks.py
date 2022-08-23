# imports
import pandas as pd
import numpy as np
from sklearn.experimental import enable_iterative_imputer
from sklearn.impute import SimpleImputer
from sklearn.impute import IterativeImputer
from sklearn.impute import KNNImputer
import local as l

# handling blanks can be done by removing the entire row, or by using imputation; the latter will be explored
# imputation uses the existing data to predict the appropriate value for the blank, so only works when 
# the imputation makes sense - otherwise, you just add bias to your data
l.clearterminal()

# create a new dataset (df) with several blanks using numpy
df = pd.DataFrame(
    {
        'items': [np.nan, 2, 4, 8, 10],
        'age': [23, np.nan, 28, 32, 40],
        'cost': [9500, 11000, np.nan, np.nan, 14760]
    },
)
print("Created Dataset")
print(df)

#############################

# SIMPLE, UNIVARIATE IMPUTER

#############################

# create the imputer variable with at least two paramenter: what the missing values look like, and what to
# replace them with (in this case, the median value for that column)
simp = SimpleImputer(missing_values=np.nan, strategy='median')

# fit the data using the imputer
print("\nSimple (Univariate) impution with median")
simp_df = pd.DataFrame(simp.fit_transform(df))
print(simp_df)

# the same can be repeated using the mean instead, and the add_indicator can be used to highlight the values
# which have been imputed
print("\nSimple (Univariate) impution with mean")
simp2 = SimpleImputer(missing_values=np.nan, strategy='mean', add_indicator=True)
simp2_df = pd.DataFrame(simp2.fit_transform(df))
print(simp2_df)

#############################

# ITERATIVE (MULTI-V) IMPUTER

#############################

# use the iterative imputer from scikit to fit and transform based on regression values - blanks 
# will be calculated using the values and their relationships to each other

print("\nIterative (Multivariate) imputer with regression")

# as with previous, this consists of creating the imputer variable and calling it to fix_transform
iimp = IterativeImputer()
iimp_df = pd.DataFrame(iimp.fit_transform(df))
print(iimp_df)

#############################

# K-NN (MULTI-V) IMPUTER TWO

#############################

# K-NN also looks at the other variables, but instead focuses on looking for those which are most similar
# to the row with the missing value, and calculates an average based on that

print("\nK-NN (Multivariate) imputer with regression")

# once again, we follow steps similar to above, but the KNN imputer requires a paramenter 'neighbors' - this
# tells it how many other variables to look for
kimp = KNNImputer(n_neighbors=2)
kimp_df = pd.DataFrame(kimp.fit_transform(df))
print(kimp_df)