# imports
import re

# a simple pattern match for "ab" in "abc acb"
pattern = r'ab'
text = 'abc acb'
matches = re.findall(pattern, text)
print(f"Pattern: {pattern}\nText: {text}\nMatches: {matches}\n")

# using the "Positive Look Ahead" function (?=), python returns a match when any integer (\d) is followed by
# the letter 'c'
pattern = r'\d(?=c).'
text = 'a1 b2 3c 4d'
matches = re.findall(pattern, text)
print(f"Pattern: {pattern}\nText: {text}\nMatches: {matches}\n")

# this demonstrates a regular expression being used for password validation
# the caret (^) and ($) at either end tell you to look at everything from first to last character
# (?=.*\d) , (?=.*[a-z] , (?=.*[A-Z]) , (?=.*[a-zA-Z]) <- looks for alphanumeric characters
# (?=.*[!@#$). <- looks for the inclusion of ! , @ , # , or $
# .{10,} <- looks for a minimum of ten characters
# these conditions must all be matched within text to return a pattern - aka, a password must be alphanumeric,
# contain one special character, and be at least 10 digits to be accepted
pattern = r'^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z])(?=.*[!@#$]).{10,}$'
text = '''
apple
orange1
banana2$
Pomegranate3!
Pear4#
'''
matches = re.findall(pattern, text, re.MULTILINE)
print(f"Pattern: {pattern}\nText: {text}\nMatches: {matches}\n")

# this pattern matcher/regular expression looks to pull text from a html file, specifically it is looking for
# body text. it is looking for any text wedged between <\w+) and </\w+> where 'w' is any letter
# however, this isn't a good use of regular expressions, as any attibute added to something like HTML means the
# expression would no longer work
pattern = r'<\w+>(.*?)</\w+>'
text = '''
<html>
    <body>
        <b>Text to be matched</b>
        <i>Text to be matched</i>
    </body>
</html>
'''
matches = re.findall(pattern, text, re.MULTILINE)
print(f"Pattern: {pattern}\nText: {text}\nMatches: {matches}\n")

# this regular expression is used to confirm if dates have been input in a specfic order
# \d{2} <- any two integers
# \d{4} <- any four integers
# [-/] <- a hyphen (-) or a slash (/)
# this regular expression would not confirm if the date is legitimate, however, just if the format is correct
# for example, it would accept 99/99/2001 as a date as it only recognises that dd/mm/yy or dd-mm-yy has been
# input
pattern = r'\d{2}[-/]\d{2}[-/]\d{4}'
text = '''
1-1-1900
1900-01-01
01-01-1900
01/01/1900
'''
matches = re.findall(pattern, text, re.MULTILINE)
print(f"Pattern: {pattern}\nText: {text}\nMatches: {matches}\n")

# this regular expression looks to see if an email follows a standard format of
# [a-zA-Z0-9.+-_] <- any aplhanumeric characters, a period, a plus, a hyphen, or an underscore
# +@ <- the 'at' symbol
# [a-zA-Z0-9.-]+\.[a-zA-Z]{2,63} <- any alphanumeric characters, a period, or a hyphen, followed by a period,
# followed by any alphabetical characters between 2 and 63 in length
# this will confirm if an entered email follows the correct formal, however it will not confirm it is valid or
# not already in use, hence why many systems have users enter their email twice and recieve a validation email
pattern = r'[a-zA-Z0-9.+-_]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,63}'
text = '''
example@example
@example.com
example@example.com
example+example@example.com
'''
matches = re.findall(pattern, text, re.MULTILINE)
print(f"Pattern: {pattern}\nText: {text}\nMatches: {matches}\n")

# this regular expressions demonstrates pulling a specific detail out of data, in this case a log
# [\d\.] <- looks for integers or the period - as the period is escaped (followed by a \) it tell the program
# to look for the period as a character
# + <- denotes they will match 1 or more times
# together, this shows that the script will look from the start, find matches of integers and periods until a
# character which is neither appears, then output the match
pattern = r'^[\d\.]+'
text = '''
82.50.208.243 - block1248 [21/Sep/2000:05:36:47 +0000] "GET /interactive HTTP/2.0" 401 5998
222.197.76.186 - - [21/Sep/2000:05:36:47 +0000] "HEAD /target/target HTTP/1.0" 201 21411
4.50.89.124 - - [21/Sep/2000:08:00:54 +0000] "PUT /bleeding-edge HTTP/2.0" 501 29142
116.203.184.117 - kirlin5184 [21/Sep/2000:08:00:54 +0000] "PATCH /user-centric HTTP/2.0" 100 14003
'''
matches = re.findall(pattern, text, re.MULTILINE)
print(f"Pattern: {pattern}\nText: {text}\nMatches: {matches}\n")

# this uses a capture group to determine which specific part of the log should be returned, operating to
# produce the same end result as the above code. a capture group simply denotes which part of the match should
# be returned
# (?P<name>.*) <- capture group, where <name> is the name given to your output character
# [a-zA-Z0-9.\-]+ [a-zA-Z0-9.\-]+ \[.* .*?\] \".* .* HTTP\/.*\" .* .*' <- states what the rest of the code looks
# like, so that the capture group is only returned when it is found within this specific pattern of data
pattern = r'(?P<IP>.*) [a-zA-Z0-9.\-]+ [a-zA-Z0-9.\-]+ \[.* .*?\] \".* .* HTTP\/.*\" .* .*'
text = '''
82.50.208.243 - block1248 [21/Sep/2000:05:36:47 +0000] "GET /interactive HTTP/2.0" 401 5998
222.197.76.186 - - [21/Sep/2000:05:36:47 +0000] "HEAD /target/target HTTP/1.0" 201 21411
4.50.89.124 - - [21/Sep/2000:08:00:54 +0000] "PUT /bleeding-edge HTTP/2.0" 501 29142
116.203.184.117 - kirlin5184 [21/Sep/2000:08:00:54 +0000] "PATCH /user-centric HTTP/2.0" 100 14003
'''
matches = re.findall(pattern, text, re.MULTILINE)
print(f"Pattern: {pattern}\nText: {text}\nMatches: {matches}\n")

# this script also includes a second capture group, (?P<tz>.*?), to also report the timeszone
pattern = r'(?P<IP>.*) [a-zA-Z0-9.\-]+ [a-zA-Z0-9.\-]+ \[.* (?P<tz>.*?)\] \".* .* HTTP\/.*\" .* .*'
text = '''
82.50.208.243 - block1248 [21/Sep/2000:05:36:47 +0000] "GET /interactive HTTP/2.0" 401 5998
222.197.76.186 - - [21/Sep/2000:05:36:47 +0000] "HEAD /target/target HTTP/1.0" 201 21411
4.50.89.124 - - [21/Sep/2000:08:00:54 +0000] "PUT /bleeding-edge HTTP/2.0" 501 29142
116.203.184.117 - kirlin5184 [21/Sep/2000:08:00:54 +0000] "PATCH /user-centric HTTP/2.0" 100 14003
'''
matches = re.findall(pattern, text, re.MULTILINE)
print(f"Pattern: {pattern}\nText: {text}\nMatches: {matches}\n")

# lastly, this also looks at capture groups, but this time only pulling out the path using (?<path>.*)
pattern = r'.* [a-zA-Z0-9.\-]+ [a-zA-Z0-9.\-]+ \[.* .*?\] \".* (?P<path>.*) HTTP\/.*\" .* .*'
text = '''
82.50.208.243 - block1248 [21/Sep/2000:05:36:47 +0000] "GET /interactive HTTP/2.0" 401 5998
222.197.76.186 - - [21/Sep/2000:05:36:47 +0000] "HEAD /target/target HTTP/1.0" 201 21411
4.50.89.124 - - [21/Sep/2000:08:00:54 +0000] "PUT /bleeding-edge HTTP/2.0" 501 29142
116.203.184.117 - kirlin5184 [21/Sep/2000:08:00:54 +0000] "PATCH /user-centric HTTP/2.0" 100 14003
'''
matches = re.findall(pattern, text, re.MULTILINE)
print(f"Pattern: {pattern}\nText: {text}\nMatches: {matches}\n")
