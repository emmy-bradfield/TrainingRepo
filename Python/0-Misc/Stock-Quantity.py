PRODUCT = "Cheese"
USER_NAME = "test"

records = {

}

def stock_quantity():
    global QUANTITY
    print("What is the current quantity of {} in-stock in cases?".format(PRODUCT))
    raw_quantity = input("Please only enter whole numbers, or press 'x' to exit >> ")
    if (raw_quantity == "x"):
        print("Are you sure you want to quit?")
        exit = input("Enter 'x' again to confirm and quit, enter any other key to return >> ")
        if (exit == "x"):
            quit()
        else:
            stock_quantity()
    elif (raw_quantity.isnumeric() == True):
        print("You have entered: {}. Is this correct?".format(raw_quantity))
        verify_quantity = input("Enter 'y' to confirm, 'n' to change, or 'x' to exit the system >> ")
        if (verify_quantity == "x"):
            print("Are you sure you want to quit?")
            exit = input("Enter 'x' again to confirm and quit, enter any other key to return >> ")
            if (exit == 'x'):
                quit()
            else:
                stock_quantity()  
        elif (verify_quantity == "y"):
                QUANTITY = int(raw_quantity)
                print("Updating records for {}...\nQuantity updated to {}".format(PRODUCT, QUANTITY))
        elif (verify_quantity == 'n'):
                stock_quantity()
        else:
            print("The command you entered is not valid. Please try again")
            stock_quantity()
    else:
        print("The quantity you entered is not valid. Please try again.")
        stock_quantity()

def view_records():
    print("LATEST RECORD ENTRY:\nPRODUCT = {} | QUANTITY = {}\nUpdated by {}".format(PRODUCT, QUANTITY, USER_NAME))
    records[PRODUCT] = QUANTITY
    print("\n...RECORDS UPDATED\n...")
    view = input("Would you like to see the current records? Please only enter y for yes, or any key to close RECORDS \n >> ")
    if (view == 'y'):
        print("Current stock:\n{}".format(records))
    elif (view == 'n'):
        print("Records updated and closed")


stock_quantity()
view_records()