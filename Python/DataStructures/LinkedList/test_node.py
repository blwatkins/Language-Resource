from node import Node


def test_get_data():
    node = Node(10)
    assert node.get_data() == 10


def test_get_next():
    node = Node(10)
    assert node.get_next() is None


def test_set_data():
    node = Node(10)
    node.set_data(20)
    assert node.get_data() == 20


def test_set_next():
    node = Node(10)
    next_node = Node(20)
    node.set_next(next_node)
    assert node.get_next() == next_node


def test_has_next():
    node = Node(10)
    next_node = Node(20)
    node.set_next(next_node)
    assert node.has_next()


def test_does_not_have_next():
    node = Node(10)
    assert not node.has_next()
