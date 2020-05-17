from collections import deque


class Queue:

    def __init__(self):
        self._data = deque()

    def enqueue(self, data):
        self._data.append(data)

    def dequeue(self):
        removed_data = self._data.popleft()
        return removed_data

    def print(self):
        print(list(self._data))
