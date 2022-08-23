import sys
import os.path

unix_p1 = "bin/spam.txt"
unix_p2 = "usr/local/bin/ham"

win_p1 = r"spam\ham.doc"
win_p2 = r"\\spam\ham\eggs\toast\jam.doc"

if sys.platform == 'win32':
    print("win_p1: ", win_p1)
    print("win_p2", win_p2)
    print("dirname(win_p1): ", os.path.dirname(win_p1))
    print("dirname(win_p2): ", os.path.dirname(win_p2))
    print("basename(win_p1): ", os.path.basename(win_p1))
    print("basename(win_p2): ", os.path.basename(win_p2))
    print("isabs(win_p1): ", os.path.isabs(win_p1))
    print("isabs(win_p2): ", os.path.isabs(win_p2))
else:
    print("unix_p1: ", unix_p1)
    print("unix_p2", unix_p2)
    print("dirname(unix_p1): ", os.path.dirname(unix_p1))
    print("dirname(unix_p2): ", os.path.dirname(unix_p2))
    print("basename(unix_p1): ", os.path.basename(unix_p1))
    print("basename(unix_p2): ", os.path.basename(unix_p2))
    print("isabs(unix_p1): ", os.path.isabs(unix_p1))
    print("isabs(unix_p2): ", os.path.isabs(unix_p2))
    print(
        'format("cp spam.txt {}".format(os.path.expanduser("~"))):',
        format(("cp spam.txt {}".format(os.path.expanduser("~")))),
    )
    print(
        'format("cp spam.txt {}".format(os.path.expanduser("~root"))):',
        format(("cp spam.txt {}".format(os.path.expanduser("~root")))),
    )
