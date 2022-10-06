# https://www.codewars.com/kata/62cb487e43b37a5829ab5752
from preloaded import FILTERS
import re

def is_valid(query: str) -> bool:
    temp = re.findall("[a-zA-Z0-9]+:[a-zA-Z0-9]+", query)
    for x in temp:
        filterName = re.split(":", x)[0]
        if filterName not in FILTERS:
            return False
    return True
