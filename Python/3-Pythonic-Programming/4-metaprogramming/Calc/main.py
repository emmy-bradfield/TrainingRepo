from distutils.command.build import build
from time import sleep
from calculator import *
import features as f

calc = Calculator(5, 3)

def buildCalculator():
    print("\nChecking for add function...")
    sleep(1)
    if hasattr(calc, 'add'):
        print("Add function already implemented: executing")
        sleep(1)
        calc.calculate(calc.add)
    else:
        print("Add function not found: implementing")
        sleep(1)
        setattr(calc, 'add', f.add)
        calc.calculate(calc.add)
        
    sleep(1)
    print("\nChecking for subtract function...")
    sleep(1)
    if hasattr(calc, 'sub'):
        print("Subtract function already implemented: executing")
        sleep(1)
        calc.calculate(calc.sub)
    else:
        print("Subtract function not found: implementing")
        setattr(calc, 'sub', f.sub)
        sleep(1)
        calc.calculate(calc.sub)
        
    sleep(1)
    print("\nChecking for multiply function...")
    sleep(1)
    if hasattr(calc, 'mul'):
        print("Add function already implemented: executing")
        sleep(1)
        calc.calculate(calc.mul)
    else:
        print("Multiply function not found: implementing")
        sleep(1)
        setattr(calc, 'mul', f.mul)
        calc.calculate(calc.mul)
        
    sleep(1)
    print("\nChecking for divide function...")
    sleep(1)
    if hasattr(calc, 'div'):
        print("Subtract function already implemented: executing")
        sleep(1)
        calc.calculate(calc.div)
    else:
        print("Divide function not found: implementing")
        sleep(1)
        setattr(calc, 'div', f.div)
        calc.calculate(calc.div)

buildCalculator()