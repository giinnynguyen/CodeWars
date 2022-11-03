# https://www.codewars.com/kata/57a37f3cbb99449513000cd8
# removes from string all non-digit characters and parse the remaining to number. E.g: "hell5o wor6ld" -> 56

import re
def get_number_from_string(string):
    string = re.sub("\D+", "", string)
    return int(string) 
  
