#! /usr/bin/python3
import sys
sys.version_info[0]

lab_exercise = "Lists"
lab_type = "lab-code"
python_version = ("%s.%s.%s" % (sys.version_info[0], sys.version_info[1], sys.version_info[2]))
print("Exercise: %s" % (lab_exercise))
print("Type: %s" % (lab_type))
print("Python: %s\n" % (python_version))

#====================================

#CODE1: Create an empty LIST
list1 = []
print("CODE1:")
print(f"list1 = {list1}")
print(f"data type = {type(list1)}")
print(f"length = {len(list1)}")
print()

#CODE2: Create LIST with 1 item
list2 = ["cloudacademy"]
print("CODE2:")
print(f"list2 = {list2}")
print(f"data type = {type(list2)}")
print(f"length = {len(list2)}")
print()

#CODE3: Create LIST with multiple items of the same type
list3 = [1, 2, 3, 4, 5]
print("CODE3:")
print(f"list3 = {list3}")
print(f"data type = {type(list3)}")
print(f"length = {len(list3)}")
print()

#CODE4: Create LIST with multiple items of different types
list4 = ["cloud", "academy", 1, True, False]
print("CODE4:")
print(f"list4 = {list4}")
print(f"data type = {type(list4)}")
print(f"length = {len(list4)}")
print()

#CODE5: Iterate over LIST with multiple items
print("CODE5:")
for item in list4:
  print(item)
print()

#CODE6: Search in LIST
print("CODE6:")
print ("cloud" in list4)
print ("blah" in list4)
print()

#CODE7: Retrieve item from LIST
print("CODE7:")
item0 = list4[0]
item1 = list4[1]
print(f"item0 = {item0}")
print(f"item1 = {item1}")
print()

#CODE8: Change mutable LIST
print("CODE8:")
list4[0] = "possible!!"
print(f"list4 = {list4}")
print(f"data type = {type(list4)}")
print(f"length = {len(list4)}")
print()

#CODE9: Append to LIST
print("CODE9:")
list4.append("new item")
print(f"list4 = {list4}")
print(f"data type = {type(list4)}")
print(f"length = {len(list4)}")
print()
