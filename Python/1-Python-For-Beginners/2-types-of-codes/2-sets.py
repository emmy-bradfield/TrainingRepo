#! /usr/bin/python3
import sys
sys.version_info[0]

lab_exercise = "Sets"
lab_type = "lab-code"
python_version = ("%s.%s.%s" % (sys.version_info[0], sys.version_info[1], sys.version_info[2]))
print("Exercise: %s" % (lab_exercise))
print("Type: %s" % (lab_type))
print("Python: %s\n" % (python_version))

#====================================

#CODE1: Create an empty SET
set1 = set()
print("CODE1:")
print(f"set1 = {set1}")
print(f"data type = {type(set1)}")
print(f"length = {len(set1)}")
print()

#CODE2: Create SET with 1 item
set2 = {"cloudacademy"}
print("CODE2:")
print(f"set2 = {set2}")
print(f"data type = {type(set2)}")
print(f"length = {len(set2)}")
print()

#CODE3: Create SET with multiple items of the same type
set3 = {1, 2, 3, 4, 5}
print("CODE3:")
print(f"set3 = {set3}")
print(f"data type = {type(set3)}")
print(f"length = {len(set3)}")
print()

#CODE4: Create SET with multiple items of different types
set4 = {"cloud", "academy", 1, True, False}
print("CODE4:")
print(f"set4 = {set4}")
print(f"data type = {type(set4)}")
print(f"length = {len(set4)}")
print()

#CODE5: Iterate over SET with multiple items
print("CODE5:")
for item in set4:
  print(item)
print()

#CODE6: Search in SET
print("CODE6:")
print ("cloud" in set4)
print ("blah" in set4)
print()

#CODE7: Attempt to retrieve item from SET
print("CODE7:")
try:
  item0 = set4[0]
  item1 = set4[1]
  print(f"item0 = {item0}")
  print(f"item1 = {item1}")
except:
  print("Sets do not support indexing!!")
print()

#CODE8: Add new unique item to SET
print("CODE8:")
set4.add("devops")
print(f"set4 = {set4}")
print(f"data type = {type(set4)}")
print(f"length = {len(set4)}")
print()

#CODE9: Add new non-unique item to SET
print("CODE9:")
set4.add("devops") # added prev
print(f"set4 = {set4}")
print(f"data type = {type(set4)}")
print(f"length = {len(set4)}")
print()

#CODE10: Remove item from SET
print("CODE10:")
set4.remove("cloud")
print(f"set4 = {set4}")
print(f"data type = {type(set4)}")
print(f"length = {len(set4)}")
print()