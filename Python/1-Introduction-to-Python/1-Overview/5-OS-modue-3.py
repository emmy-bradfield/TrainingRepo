import os
os.system("hostname")

with os.popen('netstat -an') as netstat_in:
    for entry in netstat_in:
        if 'ESTAB' in entry:
            print(entry, end='')