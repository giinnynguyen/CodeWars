### [Problem](https://www.codewars.com/kata/51f2b4448cadf20ed0000386/) 

Complete the function/method so that it returns the url with anything after the anchor (#) removed

Example: <br>
"www.codewars.com#about" --> "www.codewars.com"<br>
"www.codewars.com?page=1" -->"www.codewars.com?page=1"<br>

### First Solution (python)
```python
def remove_url_anchor(url):
    temp =  url.split("#")
    return temp[0]
```
