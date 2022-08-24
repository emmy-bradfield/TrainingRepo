def say_hello():
    print("Hello1")

say_hello()

hello="Hello2"

def speak(hello):
    print(hello)

speak(hello)

def return_hello():
    return "Hello3"

print(return_hello())

def sqrt(num):
    print(num ** .5)

sqrt(25)

def fun_one():
    print("hello world")

def fun_two(n):
    print(n**2)

def fun_three(count=3):
    for _ in range(count):
        print("spam", end="\n")

fun_one()
fun_two(5)
fun_three()
fun_three(10)

def fun_four(n, *opt):
    print("fun_four():")
    print("n is: ", n)
    print("opt is: ", opt)
    print("-" * 20)

fun_four(2)
fun_four(2, 10)

def fun_five(*, spam=0, eggs=0):
    print("fun_five():")
    print("spam is: ", spam)
    print("eggs is: ", eggs)
    print()

fun_five(spam=1, eggs=2)
fun_five(spam=2)
fun_five()

def fun_six(**named_args):
    print("fun_six():")
    for name in named_args:
        print(name, "==>", named_args[name])

fun_six(name="lancelot", quest="grail", colour="red")

def fun_six2(**named_args):
    print(named_args)
    print(type(named_args))

fun_six2(name="Emily", age=23)