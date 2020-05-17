def bubble_sort_ascending(data):

    for length in range(len(data) - 1, 0, -1):
        bubble_down(data, length)


def bubble_down(data, length):

    for index in range(length):
        compare_with_next(data, index)


def compare_with_next(data, index):

    if data[index] > data[index + 1]:
        swap(data, index, index + 1)


def swap(data, index_a, index_b):
    temp = data[index_a]
    data[index_a] = data[index_b]
    data[index_b] = temp


def main():
    data = [14, 56, 89, 34, 2, 35, 90, 4, 59]
    print(data)
    bubble_sort_ascending(data)
    print(data)


if __name__ == '__main__':
    main()
