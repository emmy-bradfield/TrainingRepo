import re

pattern = r'[6, 7, 8]+?'
text = '0987654321234567890'
matches = re.findall(pattern, text, re.MULTILINE)
print(f"Matches: {matches}")

# Example text to search:
# 0987654321234567890

# Should match:
# ['8', '7', '6', '6', '7', '8']


pattern = r'ho{,2}p'
text = 'hop hoop hooop hoooop hooooop'
matches = re.findall(pattern, text, re.MULTILINE)
print(f"Matches: {matches}")

# Example text to search:
# 'hop hoop hooop hoooop hooooop'

# Should match:
# ['hop', 'hoop']


pattern = r'https://(.*)'
text = 'https://cloudacademy.com'
matches = re.findall(pattern, text, re.MULTILINE)
print(f"Matches: {matches}")

# Example text to search:
# 'https://cloudacademy.com'

# Should match:
# ['cloudacademy.com']


pattern = r'.*\d.*'
text = '''
space
space1
apple
2apple
brush
brush3
'''
matches = re.findall(pattern, text, re.MULTILINE)
print(f"Matches: {matches}")

# Example text to search:
'''
space
space1
apple
2apple
brush
brush3
'''

# Should match:
# ['space1', '2apple', 'brush3']


pattern = r'[a-zA-Z0-9]+ /endpoint+ (?P<IP>.*) [0-9]'
text = '''
user1 GET /endpoint 1.1.1.1 200
user2 POST /endpoint 2.2.2.2 201
user1 PUT /endpoint 3.3.3.3 500
user1 PATCH /endpoint 4.4.4.4 401
'''
matches = re.findall(pattern, text, re.MULTILINE)
print(f"Matches: {matches}")

# Example text to search:
'''
user1 GET /endpoint 1.1.1.1 200
user2 POST /endpoint 2.2.2.2 201
user1 PUT /endpoint 3.3.3.3 500
user1 PATCH /endpoint 4.4.4.4 401
'''

# Should match:
# ['1.1.1.1', '2.2.2.2', '3.3.3.3', '4.4.4.4']

