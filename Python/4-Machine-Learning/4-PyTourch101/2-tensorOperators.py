import torch
import numpy as np

np_data = np.random.rand(2, 3)
print(np_data)

np_torch = torch.from_numpy(np_data)
print(np_torch)

np_torch_direct = torch.tensor(np_data)
print(np_torch_direct)

print(np_torch_direct.cpu().numpy())

np_data_2 = np.random.rand(2, 3)
print(np_data_2)

my_tensor = torch.tensor(np_data)
my_tensor2 = torch.tensor(np_data_2)
print(my_tensor, my_tensor2)

cat_tensor = torch.cat((my_tensor, my_tensor2), dim=0)
print(cat_tensor)

cat_tensor2 = torch.cat((my_tensor, my_tensor2), dim=1)
print(cat_tensor2)

clip_tensor = my_tensor2.clip(0.3, 0.7)
print(clip_tensor)

el_mul = my_tensor.mul(my_tensor2)
el_mul2 = my_tensor*my_tensor2
print(el_mul, el_mul2)

# mat_mul = my_tensor.matmul(my_tensor2)
# mat_mul2 = my_tensor@my_tensor2
# print(mat_mul, mat_mul2)

my_sum = my_tensor2.sum()
sum_item = my_sum.item()
print(my_sum, sum_item)

ang_tensor = torch.arange(20,  dtype=torch.float32)
print(ang_tensor)

matrix_a = ang_tensor #.reshape(2, 3)
matrix_b = matrix_a.clone()
print(matrix_a, matrix_b)

sigma = matrix_a + matrix_b
print(sigma)

mean = matrix_a.mean()
print(mean)

mean2 = matrix_b.mean()
print(mean2)