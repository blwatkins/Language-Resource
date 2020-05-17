def binary_search(data, key):
    key_index = None
    lower_index = 0
    upper_index = len(data)

    while lower_index <= upper_index:
        middle_index = (upper_index + lower_index) // 2

        if data[middle_index] == key:
            key_index = middle_index
            break

        if key > data[middle_index]:
            lower_index = middle_index + 1
        else:
            upper_index = middle_index - 1

    return key_index


def main():
    data = [1, 2, 3, 4, 5, 6, 7, 8]
    print(data)
    index = binary_search(data, 2)
    print(index)
    index = binary_search(data, 8)
    print(index)
    index = binary_search(data, -2)
    print(index)


if __name__ == '__main__':
    main()
