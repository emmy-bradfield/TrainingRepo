from decorator import prettyFunctions

@prettyFunctions
def add(one, two):
    return round((one + two), 2)

@prettyFunctions
def sub(one, two):
    return round((one - two), 2)

@prettyFunctions
def mul(one, two):
    return round((one * two), 2)

@prettyFunctions
def div(one, two):
    return round((one / two), 2)