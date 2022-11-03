# https://www.codewars.com/kata/57e1e61ba396b3727c000251
# Remove all number from string
import re

# d+: match one or more digit
def string_clean(s):
    s = re.sub("\d+", "", s)
    return s
