import pytest
from postitive_integer import PositiveInteger


def test_positive_integer_creation():
    p = PositiveInteger(45)
    assert p.get_value() == 45


def test_invalid_positive_integer_creation():

    with pytest.raises(Exception) as e:
        p = PositiveInteger(-34)
