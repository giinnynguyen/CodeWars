# https://www.codewars.com/kata/56a25ba95df27b7743000016

import re
def validate_code(code):
    codeStr = str(code)
    return bool(re.match("^[123]", codeStr))
