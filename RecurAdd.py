def recur_add(numbers):
    #Creating base case for when list is empty returns 0
    if len(numbers) == 0:
        return 0
    #Creating a recursive call that will add all elements in the list until the list is empty
    else:
        return (numbers[0]) + recur_add(numbers[1:])


if __name__ == '__main__':
    # using map() to iterate over every element in the list turning each one into an int object /using split to user input into tokens
    nums = list(map(int, input('Enter list of numbers to sum : ').strip().split()))

    # Print statement that will print the sum of the users list with two digits included after the decimal point
    print(f'The sum of the numbers is : {(recur_add(nums)):.2f}')
