import os
import calendar
import webbrowser

hcal = calendar.HTMLCalendar()
formatted_month = hcal.formatmonth(2012, 1)

html_file_name = 'simple_calendar.html'

with open(html_file_name, 'w') as calendar_out:
    calendar_out.write(formatted_month)
    webbrowser.open("file://" + os.path.realpath(html_file_name))