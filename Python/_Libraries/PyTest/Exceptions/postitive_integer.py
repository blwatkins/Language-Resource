class PositiveInteger:

    def __init__(self, value):

        if value <= 0:
            raise ValueError("value must be a positive integer")

        self._value = value

    def get_value(self):
        return self._value


if __name__ == '__main__':
    print("Positive Integer Class")
