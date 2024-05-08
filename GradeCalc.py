import math


# Defining a function that will compute the sum of all values in updated comp163Cat dict
def course_total(comp163Cat):
    return sum(comp163Cat.values())


# Defining a function that will find the letter grade that corresponds to grade total
def find_letter_grade(total):
    grade = math.floor(total)

    if grade < 55:
        letter = 'F'
    elif grade <= 59:
        letter = 'D'
    elif grade <= 64:
        letter = 'D+'
    elif grade <= 67:
        letter = 'C-'
    elif grade <= 71:
        letter = 'C'
    elif grade <= 74:
        letter = 'C+'
    elif grade <= 77:
        letter = 'B-'
    elif grade <= 81:
        letter = 'B'
    elif grade <= 84:
        letter = 'B+'
    elif grade <= 89:
        letter = 'A-'
    elif grade >= 90:
        letter = 'A'
    return letter


# SCRIPT
if __name__ == '__main__':

    # Creating a dictionary that has category as keys and weight as values
    comp163Cat = {
        'Homework': 10,
        'Program assignments': 30,
        'Quiz': 15,
        'Test': 20,
        'Final Exam': 25
    }
    # Creating a dictionary that has category as keys and will have weighted points as values
    comp163CatGrades = {
        'Homework': None,
        'Program assignments': None,
        'Quiz': None,
        'Test': None,
        'Final Exam': None
    }
    # Creating a loop that will iterate through comp163Cat dict and start category grade calculation
    for category in comp163Cat:
        print(f'{category} Category')
        category_grade = float(input(f'Enter grade for Category {category} : '))
        catGrade = []
        # creating a loop that will find all  category weighted grades and append them to catGrade
        while category_grade != -1:
            catGrade.append(category_grade)
            # stops loop at final exam as it only takes one grade
            if category == 'Final Exam':
                break
            category_grade = float(input(f'Enter grade for Category {category} : '))
        # find the average of each category and store it as the corresponding value for category key
        avg_of_cat = sum(catGrade) / len(catGrade)
        comp163CatGrades[category] = (comp163Cat[category] / 100) * avg_of_cat
    # print  weighted total of each category
    for total in comp163CatGrades:
        print(f'{total} weighted total is {comp163CatGrades[total]:.2f}')
    # prints weighted total
    print(f'Your weighted total in the class is: {course_total(comp163CatGrades):.2f}')
    # print letter grade
    print(f'Your letter grade in the class is: {find_letter_grade(course_total(comp163CatGrades))}')import math


