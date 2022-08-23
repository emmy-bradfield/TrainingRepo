#! /usr/bin/python3
import sys
sys.version_info[0]

lab_exercise = "Find"
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

#CODE1: Find word/letter in string
print("CODE1:")
print(f"find '{letter1}' = {data.find(letter1)}")
print(f"find '{letter1}' = {data.find(letter1,6)}") # Find the index of the first 'a' starting at index 6
print(f"find '{word1}' = {data.find(word1)}")
print(f"index '{num1}' = {data.index(num1)}")
print()

#CODE2: Check string endswith and/or startswith another string
print("CODE2:")
print(f"endswith = {data.endswith('2019')}")
print(f"startswith = {data.startswith(letter1)}")
print()

#CODE3: Is string alphanum, alpha, and/or digit
print("CODE3:")
print(f"isalnum = {data.isalnum()}") # Not alphanumeric because of '.'
print(f"isalpha = {data.isalpha()}") # Not alpha because of '.' and digits
print(f"isdigit = {num1.isdigit()}")
print()
