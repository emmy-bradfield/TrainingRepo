import torch

# create a tensor with five random data points
x = torch.tensor([-1.397, 2.5497, 0.972, 1.9186, -0.1234])

# create a lost function, in this case x^2 - 5
loss = x**2 -5

# the output shows torch has applied the loss function to the tensor (to each element)
# -- this is our forward propegation step
print(loss)

# to get the gradient, set requires_grad=True in the tensor
z = torch.tensor([-1.397, 2.5497, 0.972, 1.9186, -0.1234], requires_grad=True)
loss2 = z **2 -5
print(loss2)

# this will tell us the grad type, and the grad_fn attribute can be used to inspect further
print(loss2.grad_fn)

# then, this can be applied to the loss function. it is necesary to supply a tensor of the same shape
# when doing this, although the content doesn't matter, so a tensor of ones is fun
loss2.backward(gradient=torch.ones(5))

# this has now calculated the gradiant with respect to the tensor, and now can be inspected
print(z.grad)

# as the derivative of x^2 is 2x, we get the same output using that as the backwards method, and
# this can be used to check calculations
print("2z =", 2*z, " | or, from the original, 2x = ", 2*x)

# pytorch keeps the history of gradients when calculation, however generally this is undesirable
# to keep pytorch from keeping the gradients when running calculations, you can 
# 1) Use the detach method to create a new tensor
a = torch.rand(2, 2, requires_grad=True)
print(a)
print(a.requires_grad)
b = a.detach()
print(b)
print(b.requires_grad)

# 2) Use the no grad wrapper before a tensor operation
c = torch.rand(2, 2, requires_grad=True)
print(c)

with torch.no_grad():
    loss3 = c **2
    print(loss3.requires_grad)
