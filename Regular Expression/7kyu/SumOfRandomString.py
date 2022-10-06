# https://www.codewars.com/kata/55da6c52a94744b379000036
# sum all number in string

import re

def sum_from_string(strng):
    numbers = re.findall("\d+", strng)
    if len(numbers) == 0: return 0
    sum = 0
    for num in numbers:
        sum += int(num)
    return sum
