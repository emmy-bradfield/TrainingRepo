class Calculator():
    def __init__(self, one, two):
        self._one = one
        self._two = two

    def calculate(self, op):
        result = op(self._one, self._two)
        print(f"{self._one} + {self._two} = {result}")
        return result