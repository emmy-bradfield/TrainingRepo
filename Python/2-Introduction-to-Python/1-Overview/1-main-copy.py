fruits = ['apple', 'cherry', 'orange', 'kiwi', 'banana', 'pear', 'fig']
name = "Andrew Larkin"
knight = 'King', 'Andrew', 'New Zealand'

print(fruits[3])
print(name[0])
print(knight[1])

list2 = ['apple', 'banana', 'mango']
list3 = []
list4 = 'apple banana mango'.split()

print('list2', list2)
print('list3', list3)
print('list4', list4)

print('list2[0]', list2[0])
print('list4[2]', list4[2])

colours = "red blue green yellow brown black".split()
months = "Jan Feb Mar Apr May Jun Jul Aug Sep Oct Nov Dec".split()

for i, colour in enumerate(colours):
    print(i, colour)

print()

for num, month, in enumerate(months, 1):
    print("{} {}".format(num, month))

print("yellow in colours: ", ("yellow" in colours))
print("pink in colours: ", ("pink" in colours))
print("colours: ", ",".join(colours))

del colours[4]
print("removed 'brown':", ",".join(colours))
colours.remove('green')
print("removed 'green':", ",".join(colours))

sum_of_lists = [True] + [True] + [False]
print("sum of lists: ", sum_of_lists)

product = [True]*5
print("product of lists:", product)