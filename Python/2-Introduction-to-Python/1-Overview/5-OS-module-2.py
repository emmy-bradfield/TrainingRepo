import sys
import os

if sys.platform == 'win32':
    user_key = 'USERNAME'
else:
    user_key = 'USER'

count_key = 'COUNT'

os.environ[count_key] = "42"
print("count is", os.environ[count_key], "user is", os.environ[user_key])
print("count is", os.environ.get(count_key), "user is", os.environ.get(user_key))
user = os.getenv(user_key)
count = os.getenv(count_key)
print("count is", count, "user is", user)
cmd = "count is ${} user is ${}".format(count_key, user_key)
print("cmd: ", cmd)
print(os.path.expandvars(cmd))