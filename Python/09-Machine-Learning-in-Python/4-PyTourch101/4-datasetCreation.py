import torch
from torch.utils.data import Dataset
from torch.utils.data import DataLoader

from sklearn.datasets import make_classification
from sklearn.datasets import make_multilabel_classification

class CustomDataset(Dataset):

    def __init__(self, X, y):
        self.X = X
        self.y = y
    
    def __len__(self):
        """
        Returns the total number of samples available in our dataset
        """
        return len(self.X)

    def __getitem__(self, idx):
        """
        Returns a sample of data at the specified index (idx)
        """
        return (self.X[idx], self.y[idx])


data, target = make_classification(n_samples=1000, n_features=5)
custom_dataset = CustomDataset(X = data, y=target)

print(len(custom_dataset))
print(custom_dataset[0])
print(data[0])
print(custom_dataset[0][0].shape)

data, target = make_multilabel_classification(n_samples=1000, n_features=5, n_classes=3)
custom_ml_dataset = CustomDataset(X = data, y = target)
print(len(custom_ml_dataset))
print(custom_ml_dataset[0])
print(data[0])
print(custom_ml_dataset[0][0].shape)

data_loader = DataLoader(dataset=custom_dataset, batch_size=8, shuffle=True)
print(data_loader)

data_iter = iter(data_loader)
print(data_iter)

data_01 = data_iter.next()
print(data_01)

features_01, target_01 = data_01
print("\n\n", features_01, "\n\n", target_01)

