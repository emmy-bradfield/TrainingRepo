from random import random

class Animal():
    count = 0
    
    def __init__(self, species, predator):
        self._species = species
        self._predator = predator
        self._hunger = 100
        self._fun = 100
        self._energy = 100
        Animal.count +=1
    
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
        
    @classmethod
    def countAnimals(cls):
        print(f"There are {cls.count} animals")
    
    def speak (self, sound):
        print(f"The {self._species} says {sound}")
       

class Hunter():
    def hunt(self):
        if random() < self._rate:
            print(f"Success! The {self._species} caught some prey")
            if self.hunger < 100:
                self.hunger = self.hunger + 10
        else:
            print(f"Failure... no dinner for the {self._species} today")
            self.hunger = self.hunger - 5
        self.energy -= 10
        print(f"Hunger: {self.hunger} | Fun: {self.fun} | Energy: {self.energy}")