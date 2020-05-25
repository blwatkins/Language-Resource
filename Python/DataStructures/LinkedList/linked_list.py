from node import Node


class LinkedList:

    def __init__(self):
        self._head = None

    def __str__(self):
        output = '[ | '
        current = self._head

        while current is not None:
            output += str(current.get_data()) + ' | '
            current = current.get_next()

        output += ']'
        return output

    def add(self, data):

        if self.is_empty():
            self._head = Node(data)
        else:
            node = Node(data)
            current = self._head

            while current.has_next():
                current = current.get_next()

            current.set_next(node)

    def delete(self, index):

        if 0 <= index < self.size():

            if self.size() == 1:
                self._head = None
            else:
                if index == 0:
                    self._head = self._head.get_next()
                else:
                    current_index = 0
                    current = self._head

                    while current_index < index - 1:
                        current = current.get_next()
                        current_index += 1

                    current.set_next(current.get_next().get_next())

    def get(self, index):
        data = None

        if not self.is_empty():
            current_index = 0
            current = self._head

            while current is not None:

                if index == current_index:
                    data = current.get_data()
                    break
                else:
                    current = current.get_next()
                    current_index += 1

        return data

    def size(self):
        count = 0

        if not self.is_empty():
            current = self._head

            while current is not None:
                count += 1
                current = current.get_next()

        return count

    def to_list(self):
        values = list()

        if not self.is_empty():
            current = self._head

            while current is not None:
                values.append(current.get_data())
                current = current.get_next()

        return values

    def is_empty(self):
        return self._head is None
