#! /usr/bin/python3
import sys
sys.version_info[0]

lab_exercise = "OldestFile"
lab_type = "solution-code"
python_version = ("%s.%s.%s" % (sys.version_info[0], sys.version_info[1], sys.version_info[2]))

print("Exercise: %s" % (lab_exercise))
print("Type: %s" % (lab_type))
print("Python: %s\n" % (python_version))
print()

#====================================

#CODE1: Import os and datetime modules
import os
from datetime import datetime

#CODE2: Test input args to the script
if len(sys.argv) > 1:
    directory = sys.argv[1]
else:
    print("Syntax: %s directory" % sys.argv[0])
    sys.exit(1)

#CODE3: get files in specified directory and prepend the full path
entries = [os.path.join(directory, file) for file in os.listdir(directory)]

#CODE4: filter out non-files
files = [f for f in entries if os.path.isfile(f)]

#CODE5: transform list of filenames into list of (filename,unixtimestamp) tuples
files = [[f, os.stat(f)[-2]] for f in files]

#CODE6: sort files by timestamp
sorted_files = sorted(files, key=lambda e: e[1])

#CODE7: convert from Unix timestamp to python datetime object
filetime = datetime.fromtimestamp(sorted_files[0][1])

#CODE8: print as human-readable date (which it defaults to)
print(filetime, sorted_files[0][0])
