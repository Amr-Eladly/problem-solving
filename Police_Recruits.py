def untreated_crimes():
    n = int(input())
    events = list(map(int, input().split()))
    sum_events = 0
    counter = 0

    for event in events:
        sum_events += event
        if sum_events < 0:
            counter += 1
            sum_events = 0

    print(counter)

if __name__ == "__main__":
    untreated_crimes()
