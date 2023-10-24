import sample
import pytest

def Test_Function():
    assert sample.Calculate_Sum(5,5) == 10
    assert sample.Calculate_Sum(5,1) != 7
