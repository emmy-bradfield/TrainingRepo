from termcolor import colored
import textwrap

print("")
with open("C:/Users/EmmyB.000/Desktop/QA/Python-Learning-Path/Introduction-to-Python/Science.txt", "rb") as Science_in:
    while True:
        chunk = Science_in.read(120)
        if chunk == b"":
            break
        print(colored(chunk.decode(), 'magenta').center(120))

explan = colored("EXPLANATION OF CODE", 'red', attrs=['bold'])
print("")
print(explan.center(120))

print("")
subsect0 = colored("with open(", 'cyan')
subsect1 = colored("<path>", 'yellow')
subsect2 = colored(")", 'cyan')
sequ1 = (subsect0, subsect1, subsect2)
sect1 = "".join(sequ1)
freetext1 = str(" is used to tell python the location of the file. Use forward- instead of back- slash to avoid a unicode syntax error. Replace '<path>' with the actual path of the file you are wanting to open. Follow this with ', 'rb''")
text1 = sect1+freetext1
wrapper1 = textwrap.TextWrapper(width=120)
part1 = wrapper1.wrap(text=text1)
for element in part1:
    print(element)

text2 = colored("> while True:", 'cyan')
part2 = text2.ljust(120)
print(part2)

subsect3 = colored(">> chunk =", 'cyan')
subsect4 = colored(" <filename>", 'yellow')
subsect5 = colored("_in.read(", 'cyan')
subsect6 = colored("<n>", 'yellow')
subsect7 = colored(") ", 'cyan')
sequ31 = (subsect3, subsect4, subsect5, subsect6, subsect7)
sect3 = "".join(sequ31)
freetext31 = str(" is then used to determine how many characters are allowed per line, with the")
freetext32 = colored(' <n>', 'yellow')
freetext33 = str(" in")
freetext34 = colored(' <filename>_in.read(', 'cyan')
freetext35 = colored('<n>', 'yellow')
freetext36 = colored(')', 'cyan')
freetext37 = str(" being the specified number. Lastly,")
sequ32 = (freetext31, freetext32, freetext33, freetext34, freetext35, freetext36, freetext37)
freetext3 = "".join(sequ32)
text3 = sect3 + freetext3
wrapper3 = textwrap.TextWrapper(width=120)
part3 = wrapper3.wrap(text=text3)
for element in part3:
    print(element)

text4 = colored(">>> break", 'cyan')
part4 = text4.ljust(120)
print(part4)

subset8 = colored(">> print(chunk.decode())", 'cyan')
subset9 = str(" is being used to tell the machine to print the output")
sequ5 = (subset8, subset9)
text5 = "".join(sequ5)
part5 = text5.ljust(120)
print(part5)

print("")
text6 = str("So there you go! Now you know all about how to read a file. Even more importantly, you learnt about formatting. Well, at least tried to... but this simple output is a whapping 70 lines of code... wow!")
wrapper6 = textwrap.TextWrapper(width=120)
part6 = wrapper6.wrap(text=text6)
for element in part6:
    print(colored(element, 'magenta').center(120))
