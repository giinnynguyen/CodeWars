# Link: https://www.codewars.com/kata/56a3f08aa9a6cc9b75000023

import re

# ^[a-z]$: to check regular expression that starts at the very beginning with ^ and includes every character until the end by finishing with $
# check exact length (5 char): ^[a-z]{5}$
# check limit length (3-7 char): ^[a-z]{3,7}$
# check min length (minimum 3 char): ^[a-z]{3,}$
# check max length (max 7 char): ^[a-z]{,7}$
def validate_usr(username):
    return bool(re.search("^[a-z0-9_]{4,16}$", username))
