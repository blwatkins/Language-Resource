import pytest
from my_module import greeting


# yielding single values
@pytest.fixture(scope='session')
def prepare_name():
    yield 'Bill'


# yielding multiple values
@pytest.fixture(scope='session')
def prepare_full_name():
    yield 'Bill', 'Bob'


# factory fixtures
@pytest.fixture(scope='function')
def prepare_specified_name():

    def _specify_name(sex):
        name = ''
        if sex == 'male':
            name = 'Bob'
        else:
            sex = 'Amy'
        return name

    yield _specify_name


def test_greeting(prepare_name):
    name = prepare_name
    assert greeting(name) == 'Hello, Bill!'


def test_greeting_full_name(prepare_full_name):
    first_name, last_name = prepare_full_name
    name = first_name + " " + last_name
    assert greeting(name) == 'Hello, Bill Bob!'


def test_greeting_male_name(prepare_specified_name):
    name = prepare_specified_name(sex='male')
    assert greeting(name) == 'Hello, Bob!'
