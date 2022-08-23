#! /usr/bin/python3
import sys
sys.version_info[0]

lab_exercise = "Tuples"
lab_type = "lab-code"
python_version = ("%s.%s.%s" % (sys.version_info[0], sys.version_info[1], sys.version_info[2]))
print("Exercise: %s" % (lab_exercise))
print("Type: %s" % (lab_type))
print("Python: %s\n" % (python_version))

#====================================

#CODE1: Create an empty TUPLE
tup1 = ()
print("CODE1:")
print(f"tup1 = {tup1}")
print(f"data type = {type(tup1)}")
print(f"length = {len(tup1)}")
print()

#CODE2: Create TUPLE with 1 item
tup2 = ("cloudacademy",)
print("CODE2:")
print(f"tup2 = {tup2}")
print(f"data type = {type(tup2)}")
print(f"length = {len(tup2)}")
print()

#CODE3: Create TUPLE with multiple items of the same type
tup3 = (1, 2, 3, 4, 5)
print("CODE3:")
print(f"tup3 = {tup3}")
print(f"data type = {type(tup3)}")
print(f"length = {len(tup3)}")
print()

#CODE4: Create TUPLE with multiple items of different types
tup4 = ("cloud", "academy", 1, True, False)
print("CODE4:")
print(f"tup4 = {tup4}")
print(f"data type = {type(tup4)}")
print(f"length = {len(tup4)}")
print()

#CODE5: Iterate over TUPLE with multiple items
print("CODE5:")
for item in tup4:
  print(item)
print()

#CODE6: Search in TUPLE
print("CODE6:")
print ("cloud" in tup4)
print ("blah" in tup4)
print()

#CODE7: Retrieve item from TUPLE
print("CODE7:")
item0 = tup4[0]
item1 = tup4[1]
print(f"item0 = {item0}")
print(f"item1 = {item1}")
print()

#CODE8: Attempt to change immutable TUPLE
print("CODE8:")
try:
  tup4[0] = "not possible!"
except:
  print("Tuples are immutable!!")
print()

