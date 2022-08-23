def start(): #function prints start text - fully working
    print("BRADFIELD DATA SOLUTIONS\nv1.3")

def login(): # basic name function, fully working
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

def quantity(): #quantity function 1 - improper, for reference
    global QUANT
    num = input("How many units of {} do you have? Please only enter whole numbers, or 'x' to close\n >> ".format(PRODUCT))
    while (num != '0'):
        if (num == int):
            print("You have entered {} units of {}".format(num, PRODUCT))
            QUANT = num
            break
        elif (num == 'x'):
            print("Process Ended")
            quit()
        else:
            print("I'm sorry, the value you entered isn't a whole number. Please try again.")
            quantity()
    return QUANT

def con_quantity():#quantity function 2 - improper, for reference
    global AMOUNT
    conq = input("Is this correct? Please only enter 'y' for yes, 'n' to change it, or 'x' to close\n >> ")
    if (conq == 'n'):
        print("Quantity not added.")
        quantity()
    elif (conq == 'y'):
        print("STOCK QUANTITY: {}".format(QUANT))
        AMOUNT = int(QUANT)
    elif (conq == 'x'):
        print("Process Ended")
        quit()
    else:
        print("I'm sorry, the command you entered isn't valid. Please try again.")
        con_quantity()
    return AMOUNT

def stock_quantity():
    global PRODUCT
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

stock_quantity()