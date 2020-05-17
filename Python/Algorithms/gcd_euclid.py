# Greatest Common Denominator
# Euclid's Algorithm


def gcd(a, b):
    r = a % b

    while r != 0:
        a = b
        b = r
        r = a % b

    return b


def main():
    print(gcd(60, 96))  # 12
    print(gcd(20, 8))  # 4


if __name__ == '__main__':
    main()
