from animal import *

class Cat(Hunter, Animal):
    def __init__(self):
        super().__init__(species="cat", predator=True)
        self._species = "cat"
        self._predator = True
        self._sound = "meow"
        self._rate = 0.33
        self._hunger = 100
        self._energy = 100
        self._fun = 100
        
    @property
    def hunger(self):
        return self._hunger
    @property
    def fun(self):
        return self._fun
    @property
    def energy(self):
        return self._energy
    
    @hunger.setter
    def hunger(self, hunger):
        self._hunger = hunger
    
    @fun.setter
    def fun(self, fun):
        self._fun = fun
    
    @energy.setter
    def energy(self, energy):
        self._energy = energy
    
    def speak(self):
        print(f"The {self._species} says {self._sound}")