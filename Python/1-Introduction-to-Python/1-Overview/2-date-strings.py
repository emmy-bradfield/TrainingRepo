from datetime import datetime as DateTime
import time

data = (
    ('Jan 1, 1970', '%b %d, %Y'),
    ('01/01/70', '%m/%d/%y'),
    ('1970-01-01', '%Y-%m-%d'),
    ('Jan 1, 1970 at 3:14 pm', '%b %d, %Y at %I:%M %p')
)

for date_str, parse_template in data:
    time_tuple = time.strptime(date_str, parse_template)
    print(time_tuple)
    print()

    parsed_date = DateTime.strptime(date_str, parse_template)
    print(parsed_date)
    print('-' * 20)