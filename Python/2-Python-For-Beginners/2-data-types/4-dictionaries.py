#! /usr/bin/python3
import sys
sys.version_info[0]

lab_exercise = "Dictionaries"
lab_type = "lab-code"
python_version = ("%s.%s.%s" % (sys.version_info[0], sys.version_info[1], sys.version_info[2]))
print("Exercise: %s" % (lab_exercise))
print("Type: %s" % (lab_type))
print("Python: %s\n" % (python_version))

#====================================

#CODE1: Create an empty DICTIONARY
dict1 = {}
print("CODE1:")
print(f"dict1 = {dict1}")
print(f"data type = {type(dict1)}")
print(f"length = {len(dict1)}")
print()

#CODE2: Create DICTIONARY with 1 key-value pair
dict2 = {"name": "cloudacademy"}
print("CODE2:")
print(f"dict2 = {dict2}")
print(f"data type = {type(dict2)}")
print(f"length = {len(dict2)}")
print()

#CODE3: Create DICTIONARY with multiple key-value pairs
dict3 = {"name": "cloudacademy", "color": "red", "count": 1000}
print("CODE3:")
print(f"dict3 = {dict3}")
print(f"data type = {type(dict3)}")
print(f"length = {len(dict3)}")
print()

#CODE4: Create DICTIONARY with multiple and nested key-value pairs
dict4 = {"name": "cloudacademy", "color": "red", "count": 1000, "data": {"val1": 1, "val2": 2}}
print("CODE4:")
print(f"set4 = {dict4}")
print(f"data type = {type(dict4)}")
print(f"length = {len(dict4)}")
print()

#CODE5: Iterate over DICTIONARY with multiple and nested key-value pairs
print("CODE5:")
for key, value in dict4.items():
 print(f"key={key}, value={value}")
print()

#CODE6: Search key in DICTIONARY
print("CODE6:")
print ("name" in dict4)
print ("cloudacademy" in dict4)
print()

#CODE7: Retrieve value from DICTIONARY by key
print("CODE7:")
item0 = dict4["name"]
item1 = dict4["color"]
print(f"item0 = {item0}")
print(f"item1 = {item1}")
print()

#CODE8: Change existing value in DICTIONARY
print("CODE8:")
dict4["name"] = "blah"
dict4["color"] = "blue"
print(f"dict4 = {dict4}")
print(f"data type = {type(dict4)}")
print(f"length = {len(dict4)}")
print()

#CODE9: Add new key-value pair to DICTIONARY
print("CODE9:")
dict4['qwerty'] = 'fast'
print(f"dict4 = {dict4}")
print(f"data type = {type(dict4)}")
print(f"length = {len(dict4)}")
print()

#CODE10: Pop existing key-value pair from DICTIONARY
print("CODE10:")
test = dict4.pop('qwerty', None)
print(f"test = {test}")
print(f"dict4 = {dict4}")
print(f"data type = {type(dict4)}")
print(f"length = {len(dict4)}")
print()

#CODE11: Pop non-existing key-value pair from DICTIONARY
print("CODE11:")
test = dict4.pop('cat', None)
print(f"test = {test}")
print(f"dict4 = {dict4}")
print(f"data type = {type(dict4)}")
print(f"length = {len(dict4)}")
print()