from linked_list import LinkedList


def test_is_empty():
    linked_list = LinkedList()
    assert linked_list.is_empty()


def test_add():
    linked_list = LinkedList()
    linked_list.add(10)
    assert linked_list.to_list() == [10]


def test_get():
    linked_list = LinkedList()
    linked_list.add(10)
    assert linked_list.get(0) == 10


def test_get_for_multiple_item_list():
    linked_list = LinkedList()
    linked_list.add(10)
    linked_list.add(20)
    linked_list.add(30)
    assert linked_list.get(1) == 20


def test_size():
    linked_list = LinkedList()
    linked_list.add(10)
    linked_list.add(20)
    linked_list.add(30)
    assert linked_list.size() == 3


def test_size_of_empty_list():
    linked_list = LinkedList()
    assert linked_list.size() == 0


def test_delete_first_element():
    linked_list = LinkedList()
    linked_list.add(10)
    linked_list.add(20)
    linked_list.add(30)
    linked_list.delete(0)
    assert linked_list.to_list() == [20, 30]


def test_delete_middle_element():
    linked_list = LinkedList()
    linked_list.add(10)
    linked_list.add(20)
    linked_list.add(30)
    linked_list.delete(1)
    assert linked_list.to_list() == [10, 30]


def test_delete_end_element():
    linked_list = LinkedList()
    linked_list.add(10)
    linked_list.add(20)
    linked_list.add(30)
    linked_list.delete(2)
    assert linked_list.to_list() == [10, 20]


def test_delete_invalid_index():
    linked_list = LinkedList()
    linked_list.add(10)
    linked_list.add(20)
    linked_list.add(30)
    linked_list.delete(4)
    assert linked_list.to_list() == [10, 20, 30]


def test_to_list_empty_list():
    linked_list = LinkedList()
    emtpy_list = list()
    assert linked_list.to_list() == emtpy_list


def test_to_list():
    linked_list = LinkedList()
    linked_list.add(10)
    linked_list.add(20)
    linked_list.add(30)
    values = [10, 20, 30]
    assert linked_list.to_list() == values
