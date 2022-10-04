class prettyFunctions():
    def __init__(self, func):
        self._func = func
    
    def __call__(self, *args, **kwargs):
        print("")
        print("* = " * 9, "*")
        print("")
        print("\t New Function Added:")
        print(f"\tFunction Name: {self._func.__name__}")
        if args:
            print("\tArguments: ", args)
        if kwargs:
            print("\tKey-word only Arguments: ", kwargs)
        print("")
        print("* = " * 9, "*")
        print("")
        print("RESULTS: ")
        return self._func(*args, **kwargs)