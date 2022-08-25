import torch

x = torch.tensor(1.0)
y = torch.tensor(2.0)

w = torch.tensor(1.0, requires_grad=True)

y_hat = w * x 
loss = (y_hat - y) **2
print(f"Forward Step: {loss}")

loss.backward()
print(f"Backwards Step: {w.grad}")

with torch.no_grad():
    w -= 0.01 * w.grad
    print(w)
print(w.grad)