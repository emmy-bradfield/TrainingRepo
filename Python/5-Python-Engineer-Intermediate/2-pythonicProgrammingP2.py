# lambda
import re

addFive = lambda x : x+5
print(addFive(2))

addTwoNums = lambda x,y : x+y
print(addTwoNums(20, 14))

printResult = lambda func, val : print(func(val))
printResult(addFive, 15)

fruits = ['watermelon', 'Apple', 'Mango', 'KIWI', 'apricot', 'LEMON', 'guava']
sfruits = sorted(fruits, key=lambda e : e.lower())
print(" ".join(sfruits))

# list comprehensions
numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
squared = [x**2 for x in numbers]
cubed = [x**3 for x in numbers]

evens = [x*2 for x in range(20)]

print(numbers, "\n", squared, "\n", cubed, "\n", evens)

fruits = ['watermelon', 'Apple', 'Mango', 'KIWI', 'apricot', 'LEMON', 'guava']
ufruits = [fruit.upper() for fruit in fruits]
lfruits = [fruit.lower() for fruit in fruits]

print(ufruits, "\n", lfruits)

values = [2, 42, 18, 92, "boom", ['a', 'b', 'c']]
doubles = [2*x for x in values]
print(doubles)

# dictionary comprehensions
animals = ['OWL', 'Badger', 'bushbaby', 'Tiger', 'Wombat', 'GORILLA', 'AARDDVARK']
comprehension_dict = {a.lower(): len(a) for a in animals}
print(comprehension_dict)

# set comprehension
with open("./mary.txt") as mary_in:
    s = {w.lower() for ln in mary_in for w in re.split(r'\W+', ln) if w}
    print(s)


# Generators
s1 = sum([x * x for x in range(10)])
s2 = sum(x * x for x in range(10))
print(s1, s2)

page = open("./mary.txt")
m = max(len(line) for line in page)
page.close()
print(m)

def numbers():
    a = 0
    for i in range(2):
        yield a
        a = a + 1
    for i in range (3):
        yield a
        a = a - 1
    yield 100
    yield 200
    yield 300

for num in numbers():
    print(num)

print("\n\n")

def next_prime(limit):
    flags = set()
    for i in range(2, limit):
        if i in flags:
            continue
    for j in range(2 * i, limit + 1, i):
        flags.add(j)
    yield i

for prime in next_prime(200):
    print(prime)

def trimmed(file_name):
    with open(file_name) as file_in:
        for line in file_in:
            if line.endswith('\n'):
                line = line.rstrip('\n\r')
            yield line

for trimmedline in trimmed("./mary.txt"):
    print(trimmedline)

# string formatting
print("Try one of these: {0}.jpg {0}.png {0}.bmp {0}.pdf".format('penguin'))

colour = "blue" 
animal = "iguana"

print("{} {}".format(colour, animal))

farh = 98.4735387
print('{:.1f}'.format(farh))

value = 12345
print("{0:d} {0:04x} {0:08x} {0:016b}".format(value))

data = {"A": 38, "B": 127, "C":9}
for letter, number in sorted(data.items()):
    print("{} {:4d}".format(letter, number))


# with open("./shrek.txt") as shrek:
#     nolineShrek = {w.lower() for ln in shrek for w in re.split(r'\n', ln) if w}
#     shreklist = {w.lower() for ln in nolineShrek for w in re.split(r'\W+', ln) if w}
#     sortedShrek = sorted(shreklist)
#     f = open("Shreks-abetical.txt", "w")
#     f.write("\n".join(sortedShrek))
#     f.close()

# def sendShrek():
#     msg = EmailMessage()
#     msg.set_content("\n".join(sortedShrek))
#     msg['Subject'] = 'Shreksabetical'
#     msg['From'] = 'emily-bradfield@outlook.com'
#     msg['Bcc'] = 'tarajia.ammar@gmail.com', 'chloe.bush@hotmail.co.uk'
#     s = smtplib.SMTP('smtp-mail.outlook.com', 587)
#     s.starttls()
#     s.ehlo()
#     s.login('emily-bradfield@outlook.com', 'Apple.Bob1')
#     s.send_message(msg)
#     s.quit()
#     print("Success")

# sendShrek()