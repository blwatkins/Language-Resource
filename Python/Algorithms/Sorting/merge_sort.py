def merge_sort_ascending(data):

    if len(data) > 1:
        middle_index = len(data) // 2
        left_data = split_left(data, middle_index)
        right_data = split_right(data, middle_index)
        merge_sort_ascending(left_data)
        merge_sort_ascending(right_data)
        merge(data, left_data, right_data)


def split_left(data, middle_index):
    return data[:middle_index]


def split_right(data, middle_index):
    return data[middle_index:]


def merge(data, left_data, right_data):
    left_index = 0
    right_index = 0
    merged_index = 0

    # merge both lists
    while left_index < len(left_data) and right_index < len(right_data):

        if left_data[left_index] < right_data[right_index]:
            data[merged_index] = left_data[left_index]
            left_index += 1
        else:
            data[merged_index] = right_data[right_index]
            right_index += 1

        merged_index += 1

    # fill in remaining left list
    while left_index < len(left_data):
        data[merged_index] = left_data[left_index]
        left_index += 1
        merged_index += 1

    # fill in remaining right list
    while right_index < len(right_data):
        data[merged_index] = right_data[right_index]
        right_index += 1
        merged_index += 1


def main():
    data = [14, 56, 89, 34, 2, 35, 90, 4, 59]
    print(data)
    merge_sort_ascending(data)
    print(data)


if __name__ == '__main__':
    main()
