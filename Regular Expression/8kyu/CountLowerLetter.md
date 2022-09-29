https://www.codewars.com/kata/56a946cd7bd95ccab2000055

#### Problem: <br>
Your task is simply to count the total number of lowercase letters in a string

Example:<br>
lowercaseCount("abc"); ===> 3<br>
lowercaseCount("abcABC123"); ===> 3<br>
lowercaseCount("abcABC123!@€£#$%^&*()_-+=}{[]|\':;?/>.<,~"); ===> 3<br>

#### First Solution (Python)
```python
import re
def lowercase_count(strng):
    strng = re.findall("[a-z]", strng)
    return len(strng) 
```
