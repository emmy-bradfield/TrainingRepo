# imports
import pandas as pd
from sklearn.preprocessing import OneHotEncoder
from sklearn.compose import make_column_transformer
import subscript
import local

local.clearterminal()
# assign df to the restaurant.sv file read using pandas
df = pd.read_csv( '2-Scikit-p1/data/restaurant.csv' )

# head and describe can be used to sample the data
print("df = restaurant.csv\n************************************************************** PRINT HEAD OF DF **************************************************************")
print(df.head())
print("\n*********************************************************** PRINT DESCRIPTION OF DF ***********************************************************")
print(df.describe())

# use the OneHotEncoder to transform the categorical date in
# the file ready for processing
ohe = OneHotEncoder()
ohe_df = pd.DataFrame(ohe.fit_transform(df).toarray())

# however, this creates dummy code for all the columns, and we
# don't want that - only for the categorical. so instead, we can
# use the make_column_transformer to correct this
print("\n*************************************************** PRINT DF.HEAD() WITH COLUMNS DUMMY-CODED ***************************************************")
ct = make_column_transformer(
    (ohe, ['smoker', 'sex', 'day', 'day', 'time', 'tip']),
    remainder='passthrough'
)
ct_df = pd.DataFrame(ct.fit_transform(df))
print(ct_df.head())

# to go through this further, the below consists of a toy dataset being created and the above processes used
# * # * # * # * # * # * # * # * # * # * # * # * # * # * # * # * # * # * # * # * # * # * # * # * # * # * # * #
print("\n>> Running subscript...\n")
subscript.runsub()
print("\n>> End of subscript...\n")
# * # * # * # * # * # * # * # * # * # * # * # * # * # * # * # * # * # * # * # * # * # * # * # * # * # * # * #
