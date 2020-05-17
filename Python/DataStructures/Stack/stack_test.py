from Stack.stack import Stack


def main():
    stack = Stack()
    stack.print()
    stack.push(10)
    stack.push(20)
    stack.push(30)
    stack.print()
    data = stack.pop()
    stack.print()
    print(data)


if __name__ == '__main__':
    main()
