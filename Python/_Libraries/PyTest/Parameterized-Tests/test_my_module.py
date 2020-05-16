import pytest
from my_module import hello


@pytest.mark.parametrize('name', [
    'Alice',
    'Bill',
    'Bob'
])
def test_hello(name):
    assert hello(name) == 'Hello, ' + name + '!'


@pytest.mark.parametrize('first_name, last_name', [
    ('Alice', 'Liddel'),
    ('Bill', 'Bob'),
    ('Bob', 'Bill')
])
def test_full_name_hello(first_name, last_name):
    full_name = first_name + ' ' + last_name
    assert hello(full_name) == 'Hello, ' + full_name + '!'
