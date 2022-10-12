from cat import *
from animal import *

print("")    
cat = Cat()
cat.speak()
cat.hunt()
print("")
mouse = Animal("mouse", False)
mouse.speak("squeak")
print("")
Animal.countAnimals()