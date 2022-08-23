records = {

}

def start(): #function which starts the programme - fully working
    print("BRADFIELD DATA SOLUTIONS\nv1.3")
    login()
    stock_type()
    stock_quantity()
    view_records()
    continue_update()

def update(): #function for repeating progreamme but not from the very start - fully working
    stock_type()
    stock_quantity()
    view_records()
    continue_update()

def login(): #basic name function - fully working
    global USER_NAME
    print("Please enter your details below")
    USER_NAME = input("Employee Name: ")
    print("You entered {}. Is this correct?".format(USER_NAME))
    verify_name = input("Enter 'y' to confirm, 'n' to change, or 'x' to exit the system >> ")
    if (verify_name == 'y'):
        print("Welcome, {}".format(USER_NAME))
    elif (verify_name == 'n'):
        login()
    elif (verify_name == 'x'):
        print("Are you sure you want to quit?")
        exit = input("Enter 'x' again to confirm and quit, enter any other key to return >> ")
        if (exit == 'x'):
            quit()
        else:
            login()
    return USER_NAME

def stock_type(): #function to input and confirm stock type - fully working
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
    return PRODUCT

def stock_quantity(): #function to confirm input is a number and update quantity - fully working
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

def view_records(): #function to view current records - fully working
    print("LATEST RECORD ENTRY:\nPRODUCT = {} | QUANTITY = {}\nUpdated by {}".format(PRODUCT, QUANTITY, USER_NAME))
    records[PRODUCT] = QUANTITY
    print("\n...RECORDS UPDATED\n...")
    view = input("Would you like to see the current records? Please only enter y for yes, or any key to close RECORDS \n >> ")
    if (view == 'y'):
        print("Current stock:\n{}".format(records))
    elif (view == 'n'):
        print("Records updated and closed")

def continue_update(): #function to allow additional entries to be added - needs testing with rest of code
    print("Do you wish to continue updating records?")
    new_entry = input("Press 'y' to add a new entry, or 'x' to quit\n >> ")
    if (new_entry == 'y'):
        update()
    elif (new_entry == 'x'):
        print("Are you sure you want to quit?")
        exit = input("Enter 'x' again to confirm and quit, enter any other key to return >> ")
        if (exit == 'x'):
            print("Thank you for using BRADFIELD DATA SOLUTIONS\nGoodbye.")
            quit()
        else:
            continue_update()
    else:
        print("The command you entered is not valid. Please try again")
        continue_update()

start()
