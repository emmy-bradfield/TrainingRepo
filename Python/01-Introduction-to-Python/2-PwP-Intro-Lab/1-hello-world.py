#! /usr/bin/python3
import sys
sys.version_info[0]

lab_exercise = "HelloWorld"
lab_type = "solution-code"
python_version = ("%s.%s.%s" % (sys.version_info[0], sys.version_info[1], sys.version_info[2]))
print("Exercise: %s" % (lab_exercise))
print("Type: %s" % (lab_type))
print("Python: %s\n" % (python_version))

#====================================

#CODE1: Declare message variables
message1 = "Hello World"
message2 = "CloudAcademy Labs"

#CODE2: Use string concaternation then print to the console
print(message1 + " - " + message2)

#CODE3: Use string formatting and interpolation then print to the console
print("%s - %s" % (message1, message2))

#CODE4: Uppercase the message vars before printing to the console:
print("%s - %s" % (message1.upper(), message2.upper()))

#CODE5: Create an array of words and then loop over array and determine string length of each word
words = [message1, message2]
for w in words:
    print(w, len(w))