import torch

print

my_data = [[1, 2], [3, 4]]
my_tensor = torch.tensor(my_data)
print(my_tensor.dtype)
print(my_tensor.type())
print(my_tensor.device)

# my_tensor.to('cuda')
print(my_tensor.device)

zero_tensor = torch.zeros(2, 2)
print(zero_tensor)

one_tensor = torch.ones(2, 2)
print(one_tensor)

new_tensor = one_tensor
updated_tensor = new_tensor.new_tensor(my_data)
print (updated_tensor)

another_tensor = torch.ones((2, 2), dtype=torch.int8) #device='cuda')
print(another_tensor)

int8_tensor = another_tensor.new_tensor(my_data)
print(another_tensor)
print(int8_tensor.dtype)
print(int8_tensor.device)

new_data = [[1, 2], [3, 4], [5, 6]]
another_tensor.new_tensor(new_data)
print (another_tensor)

shape = (2, 3, )
my_tensor = torch.rand(shape)
print(my_tensor)

print(torch.rand_like(my_tensor))