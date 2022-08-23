#! /usr/bin/python3
import sys
sys.version_info[0]

lab_exercise = "Count"
lab_type = "lab-code"
python_version = ("%s.%s.%s" % (sys.version_info[0], sys.version_info[1], sys.version_info[2]))
print("Exercise: %s" % (lab_exercise))
print("Type: %s" % (lab_type))
print("Python: %s\n" % (python_version))

#====================================

data = "cloudacademy.python.2019"
letter1 = 'a'
word1 = 'cloud'
num1 = '2019'

#CODE1: Count occurrences of letters and words
print("CODE1:")
print(f"count '{letter1}'='{data.count(letter1)}")
print(f"count '{word1}'='{data.count(word1)}")
print(f"count '{num1}'='{data.count(num1)}")
print()

#CODE2: Get length of string
print("CODE2:")
length=len(data)
print(f"len '{data}'={length}")
print()

#CODE3: Get max of string - the highest char in the string
print("CODE3:")
maximum = max(data)
print(f"max '{data}'={maximum}")
print()

#CODE4: Get min of string - the lowest char in the string
print("CODE4:")
minimum = min(data)
print(f"min '{data}'={minimum}")
print()
