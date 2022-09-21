# https://www.codewars.com/kata/57e1e61ba396b3727c000251
import re

#(): Match a group of characters and remembering the match
# d+: match one or more digit
def string_clean(s):
    s = re.sub("(\d)+", "", s)
    return s
