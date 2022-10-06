# https://www.codewars.com/kata/56a25ba95df27b7743000016
# check if string start with 1 or 2 or 3
import re
def validate_code(code):
    codeStr = str(code)
    return bool(re.match("^[123]", codeStr))
