from statistics import mean

def singleReger(yh, y):
    err = yh - y
    return err

def multiReger(yh, y):
    error = []
    for (yh, y) in zip(yh, y):
        err = (yh - y)
        error.append(err)
    return error
    
def singleBiner(yh, y):
    if yh-y != 0:
        err = 1
        return err
    else: 
        err = 0
        return err
    
def multiBiner(yh, y):
    error = []
    for (yh, y) in zip(yh, y):
        if yh-y != 0:
            err = 1
            error.append(err)
        else: 
            err = 0
            error.append(err)
    return error
    
def singleBooler(yh, y):
    if yh == y:
        err = False
        return err
    else: 
        err = True 
        return err

def multiBooler(yh, y):
    error = []
    for (yh, y) in zip(yh, y):
        if yh == y:
            err = False
            error.append(err)
        else: 
            err = True
            error.append(err)
    return error
    
def singleSquer(err):
    sq_error = err**2
    return sq_error

def multiSquer(error):
    squared_error = []
    for err in error:
        sq_error = err**2
        squared_error.append(sq_error)
    return squared_error