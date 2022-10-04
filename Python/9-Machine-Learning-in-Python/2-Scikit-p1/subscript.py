import pandas as pd
from sklearn.preprocessing import OneHotEncoder
from sklearn.compose import make_column_transformer

############################################################################

# The below demonstrates the use of the handle_unknown='ignore' and the 
# sparse=False parameters of OneHotEncoder so that after it has been fit to
# a dataset but a new categorical variable is added, it is easily able to
# handle it and simply overlooks that data. 

# NB: the use of sparse=False means that the .toarray() usually suffixed to
# the ohe.fit_transform(df) can now be removed

############################################################################
def runsub():
    print("################################################################################################################################################\n\n df = new dataframe\n")
    ohe = OneHotEncoder(handle_unknown='ignore', sparse=False)

    df = pd.DataFrame({
        'constructor': ['Toyota', 'Audi', 'Renault']
    })
    print(df.head())

    ohe_df = pd.DataFrame(ohe.fit_transform(df))
    print("\ntransformed data")
    print(ohe_df)

    new_df = pd.DataFrame({
        'constructor': ['Toyota', 'Jeep']
    })
    print("\nnew_df = new data\n")
    print(new_df)

    print("\ntransformed data")
    ohe_new_df = pd.DataFrame(ohe.transform(new_df))
    print(ohe_new_df)

    print("\n################################################################################################################################################")
    return