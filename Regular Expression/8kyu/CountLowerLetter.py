# https://www.codewars.com/kata/56a946cd7bd95ccab2000055
# count the lowercase letter in string
import re
def lowercase_count(strng):
    strng = re.findall("[a-z]", strng)
    return len(strng)
