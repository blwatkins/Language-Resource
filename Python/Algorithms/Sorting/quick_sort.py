def quick_sort_ascending(data):
    quick_sort(data, 0, len(data) - 1)


def quick_sort(data, first_index, last_index):

    if first_index < last_index:
        pivot_index = get_pivot_index_and_partition(data, first_index, last_index)
        quick_sort(data, first_index, pivot_index - 1)
        quick_sort(data, pivot_index + 1, last_index)


def get_pivot_index_and_partition(data, first_index, last_index):
    pivot_value = data[first_index]
    lower_index = first_index + 1
    upper_index = last_index
    done = False

    while not done:

        while lower_index <= upper_index and data[lower_index] <= pivot_value:
            lower_index += 1

        while upper_index >= lower_index and data[upper_index] >= pivot_value:
            upper_index -= 1

        if upper_index < lower_index:
            done = True
        else:
            swap(data, upper_index, lower_index)

    swap(data, first_index, upper_index)
    return upper_index


def swap(data, index_a, index_b):
    temp = data[index_a]
    data[index_a] = data[index_b]
    data[index_b] = temp


def main():
    data = [14, 56, 89, 34, 2, 35, 90, 4, 59]
    print(data)
    quick_sort_ascending(data)
    print(data)


if __name__ == '__main__':
    main()
