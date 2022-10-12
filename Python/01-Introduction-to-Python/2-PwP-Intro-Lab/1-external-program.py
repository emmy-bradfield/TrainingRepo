#! /usr/bin/python3
import sys
sys.version_info[0]

lab_exercise = "LaunchExternalCommand"
lab_type = "solution-code"
python_version = ("%s.%s.%s" % (sys.version_info[0], sys.version_info[1], sys.version_info[2]))
print("Exercise: %s" % (lab_exercise))
print("Type: %s" % (lab_type))
print("Python: %s\n" % (python_version))

#====================================

#CODE1: Import the os module
import os

#CODE2: Query the hostname of current machine
os.system("hostname")

#CODE3: Execute the netstat process on the current machine
with os.popen('netstat -an') as netstat_in:  # <2>
    for entry in netstat_in:  # <3>
        if 'ESTAB' in entry:  # <4>
            print(entry, end='')