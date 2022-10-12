import re

pattern1 = r'st.r'
text1 = 'staar'
matches1 = re.findall(pattern1, text1)
print(f"Pattern: {pattern1}\nText: {text1}\nMatches: {matches1}\n")


pattern2 = r'st.*r'
text2 = 'str'
matches2 = re.findall(pattern2, text2)
print(f"Pattern: {pattern2}\nText: {text2}\nMatches: {matches2}\n")


pattern3 = r'sta{3}r'
text3 = 'str star staar staaar staaaar'
matches3 = re.findall(pattern3, text3)
print(f"Pattern: {pattern3}\nText: {text3}\nMatches: {matches3}\n")


pattern4 = r'a\d+'
text4 = 'a123b a1234b a12345b'
matches4 = re.findall(pattern4, text4)
print(f"Pattern: {pattern4}\nText: {text4}\nMatches: {matches4}\n")


pattern5a = r'one.'
text5a = 'one1 one2 one3'
matches5a = re.findall(pattern5a, text5a)
print(f"Pattern: {pattern5a}\nText: {text5a}\nMatches: {matches5a}\n")

pattern5b = r'^one.'
text5b = 'one1 one2 one3'
matches5b = re.findall(pattern5b, text5b)
print(f"Pattern: {pattern5b}\nText: {text5b}\nMatches: {matches5b}\n")

pattern6 = r'^one.'
text6 = 'one1 one2 one3\none4 one5 one6'
matches6 = re.findall(pattern6, text6, re.MULTILINE)
print(f"Pattern: {pattern6}\nText: {text6}\n:Matches: {matches6}\n")

pattern7 = r'(.*)://(.*)'
text7 = 'http://example.com'
matches7 = re.findall(pattern7, text7)
print(f"Pattern: {pattern7}\nText: {text7}\nMatches: {matches7}\n")