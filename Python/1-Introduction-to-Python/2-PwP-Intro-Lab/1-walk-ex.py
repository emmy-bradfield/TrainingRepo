#! /usr/bin/python3
import sys
sys.version_info[0]

lab_exercise = "Traversal"
lab_type = "solution-code"
python_version = ("%s.%s.%s" % (sys.version_info[0], sys.version_info[1], sys.version_info[2]))
print("Exercise: %s" % (lab_exercise))
print("Type: %s" % (lab_type))
print("Python: %s\n" % (python_version))

#====================================

#CODE1: Import the os module
import os

#CODE2: Start in parent directory
START_DIR = ".."

#CODE3: Perform a directory traversal starting in the parent directory
def traversal():
    for currdir,subdirs,files in os.walk(START_DIR):
        for file in files:
            if file.endswith('.py'):
                fullpath = os.path.join(currdir,file)
                fsize = os.path.getsize(fullpath)
                print("{:8d} {:s}".format(fsize, fullpath))

#CODE4: If main then call the traversal function
if __name__ == '__main__':
    traversal()
