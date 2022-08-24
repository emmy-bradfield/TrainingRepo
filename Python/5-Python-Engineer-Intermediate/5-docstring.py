"""
This is a sample docstring
"""
import sys
from local import *

def main(args):
    """
    Main function doctring
    """
    clearterminal()
    function1()

def function1():
    """
    Function1 function docstring
    """
    print("Yay")

if __name__ == '__main__':
    main(sys.argv[1:])