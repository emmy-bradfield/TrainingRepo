def stock_type():
    global PRODUCT
    raw_product = input ("Please enter the name of the product you wish to update\n >> ")
    print("You have entered: {}. Is this correct?".format(raw_product))
    verify_product = input("Enter 'y' to confirm, 'n' to change, or 'x' to exit the system >> ")
    if (verify_product == 'x'):
        print("Are you sure you want to quit?")
        exit = input("Enter 'x' again to confirm and quit, enter any other key to return >> ")
        if (exit == 'x'):
            quit()
        else:
            raw_product = ''
            exit = ''
            stock_type()
    elif (verify_product == 'y'):
        PRODUCT = str(raw_product)
        print("Updating records for {}".format(PRODUCT))
    elif (verify_product == 'n'):
        stock_type()
    else:
        print("The command you entered is not valid. Please try again")
        stock_type()

stock_type()