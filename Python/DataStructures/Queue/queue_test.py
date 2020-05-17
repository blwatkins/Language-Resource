from Queue.queue import Queue


def main():
    queue = Queue()
    queue.print()
    queue.enqueue(10)
    queue.enqueue(20)
    queue.enqueue(30)
    queue.print()
    data = queue.dequeue()
    queue.print()
    print(data)


if __name__ == '__main__':
    main()
