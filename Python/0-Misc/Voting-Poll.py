QUESTION = "If you put a raw egg, in its shell, into a saucepan of boiling oil is it boiled or fried?"
CONDITION = "Enter 1 for 'boiled' or 2 for 'fried' >> "
BOILED = 0
FRIED = 0

def poll():
    print(QUESTION)
    answer = input(CONDITION)
    while (answer != '0'):
        try:
            a = int(answer)
            if (a == 1):
                BOILED=+1
                FRIED=+0
                print("Thanks, you chose: boiled")
                break
            elif (a == 2):
                BOILED=+0
                FRIED=+1
                print("Thanks, you chose fried")
                break
            else:
                print("Invalid answer: please try again")
                answer = input(CONDITION)
        except:
            print("Invalid answer: please try again")
            answer = input(CONDITION)  
            
    print("The results are... \nBoiled = {}\nFried = {}".format(BOILED, FRIED))

poll()
