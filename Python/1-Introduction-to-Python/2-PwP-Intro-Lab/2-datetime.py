#! /usr/bin/python3
import sys
sys.version_info[0]

lab_exercise = "DateTime"
lab_type = "solution-code"
python_version = ("%s.%s.%s" % (sys.version_info[0], sys.version_info[1], sys.version_info[2]))

print("Exercise: %s" % (lab_exercise))
print("Type: %s" % (lab_type))
print("Python: %s\n" % (python_version))
print()

#====================================

#CODE1: Import datetime module 
from datetime import datetime, date, timedelta

#CODE2: Get todays date
print("date.today():", date.today())

#CODE3: Get a datetime reference to now
now = datetime.now()
print("now.day:", now.day)
print("now.month:", now.month)
print("now.year:", now.year)
print("now.hour:", now.hour)
print("now.minute:", now.minute)
print("now.second:", now.second)
print()

#CODE4: Construct two dates and calculate delta between
d1 = datetime(2007, 6, 13)
d2 = datetime(2007, 8, 24)
d3 = d2 - d1
print("raw time delta:", d3)
print("time delta days:", d3.days)
print()

#CODE5: Construct an interval and add and subtract it to existing date
interval = timedelta(10)
print("interval:", interval)
d4 = d2 + interval
d5 = d2 - interval
print("d2 + interval:", d4)
print("d2 - interval:", d5)
print()

#CODE6: Construct datetimes with time component
t1 = datetime(2013, 8, 24, 10, 4, 34)
t2 = datetime(2015, 8, 24, 22, 8, 1)
t3 = t2 - t1
print("datetime(2007, 8, 24, 10, 4, 34):", t1)
print("datetime(2007, 8, 24, 22, 8, 1):", t2)
print("time diff (t2 - t1):", t3)
