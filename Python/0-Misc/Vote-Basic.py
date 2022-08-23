TITLE = "If you put a raw egg, in its shell, into a saucepan of boiling oil is it boiled or fried?\n Enter 1 for boiled, 2 for fried, or 3 to view results"
OPTION1 = "Boiled"
OPTION2 = "Fried"
opt1 = 0
opt2 = 0

def main():
    user = input(TITLE + ", 1 = " + OPTION1 + ", 2 = " + OPTION2 + "\nANSWER: ")
    while (user !='0'):
        try:
            u = int(user)
            if (u == 1):
                opt1=+1
            elif (u == 2):
                opt2=+1
            else:
                print("The current results are:\nBoiled: " + str(opt1) + "\nFried: " + str(opt2))

        except:
            print("Answer not valid, please try again: ")
        user = input(TITLE + ", 1 = " + OPTION1 + ", 2 = " + OPTION2 + "\nANSWER: ")
main()