     ######################### CHALLENGE ONE #########################
       ######################### COMPLETE #########################
# Create a function which prints a list of every other item in a list

def odds(items):
# define the function 'odd' with variable 'items'
    odd_items = items[1::2]
# create variable 'odd_items' which is equal to the variable 'items' when 
# split starting at position 1, with no end, splitting in a step of 2 
# (starting on the index 1 is the second item, then returning ever other 
# item from there)
    return odd_items
# return the new variable 'odd_items'

############################### DO NOT TOUCH ###############################
if __name__ == '__main__':
    print(odds([0, 1, 2, 3, 4, 5]))
    print(odds(['Matt', 'Andy', 'Tom', 'Jeremey']))
############################### DO NOT TOUCH ###############################



######################### CHALLENGE TWO #########################
 ######################### IN PROGRESS #########################
#Return the number of files traversed when walking the directory tree 
# starting at the given path, and only returning files walked and not 
# directories

# " Return the number of files traversed when walking the directory tree 
# starting at the given path. The returned number should only count files 
# and not directories. Arguments path: the path to a directory to start the 
# traversal. # Examples (for this host system): 
# traversal_count('/opt/yarn/bin/') returns 5
# traversal_count('/usr/share/X11/') returns 191

import os
# import OS to python

def traversal_count(path):
# define the function 'traversal_count' with the variable 'path'

    COUNT = 0
    START_DIR = path
# set count to 0, and set the variable 'START_DIR' to 'path'

    for root_dir, cur_dir, files in os.walk(path):
        COUNT += len(files)
# for all files in the os.walk of 'path', increase the variable 'count' by
# one
    return COUNT
# return the variable count

############################### DO NOT TOUCH ###############################
if __name__ == '__main__':
    print(traversal_count('/1-Python-For-Beginners'))
    print(traversal_count('/2-Introduction-to-Python/.idea'))
############################### DO NOT TOUCH ###############################



    ######################### CHALLENGE THREE #########################
       ######################### COMPLETE #########################
# design a piece of code that gives you the day of the week for any given 
# date

from datetime import datetime
import time
# import the datetime package to python

def day_of_the_week(dt):
# define the function 'day_of_the_week' with the variable 'dt'

    weekdays = {1: 'Monday',
                2: 'Tuesday',
                3: 'Wednesday',
                4: 'Thursday',
                5: 'Friday',
                6: 'Saturday',
                7: 'Sunday'}
# create a dictionary mapping the isoweek values (1 to 7) to the 
# corresponding string values (Monday to Sunday)

    day = dt.isoweekday()
    string = weekdays[day]
# set the variable 'day' as equal to the input variable 'dt' once called 
# with isoweekday then, set the new variable 'string' as equal to the 
# corresponding string in the dictionary 'weekdays' when given the key 'day' 
# (the integer generated)

    return string

############################### DO NOT TOUCH ###############################
if __name__ == '__main__':
    print(day_of_the_week(datetime(2019, 9, 6, 11, 33, 0)))
    print(day_of_the_week(datetime(2000, 12, 25, 12, 0, 0)))
############################### DO NOT TOUCH ###############################
