class Stack:

    def __init__(self):
        self._data = list()

    def push(self, data):
        self._data.append(data)

    def pop(self):
        removed_data = self._data.pop()
        return removed_data

    def print(self):
        print(self._data)
