#! /usr/bin/python3
import sys
sys.version_info[0]

lab_exercise = "YoungestPresident"
lab_type = "solution-code"
python_version = ("%s.%s.%s" % (sys.version_info[0], sys.version_info[1], sys.version_info[2]))

print("Exercise: %s" % (lab_exercise))
print("Type: %s" % (lab_type))
print("Python: %s\n" % (python_version))
print()

#====================================

#CODE1: Import datetime module
import datetime

#CODE2: Create a date creation helper function
def make_date(date_string):
    raw_year, raw_month, raw_day = date_string.split('-')
    year = int(raw_year)
    month = int(raw_month)
    day = int(raw_day)

    return datetime.date(year, month, day)


#CODE3: Create empty list
all_presidents = []

#CODE4: Open data file and read each record
with open("./presidents.txt") as PRES:
    for rec in PRES:
        _, last_name, first_name, birthday, _, _, _, inauguration_day, *_ = rec.split(":")

        birth_date = make_date(birthday)
        took_office_date = make_date(inauguration_day)

        raw_age_at_inauguration = took_office_date - birth_date
        age_at_inauguration = round(raw_age_at_inauguration.days / 365.25, 1)

        full_name = '{} {}'.format(first_name, last_name)

        all_presidents.append((age_at_inauguration, full_name))

#CODE5: Loop through sorted list and print out to console 
for age, name in sorted(all_presidents):
    print(name, age)
