
# https://www.codewars.com/kata/51f2b4448cadf20ed0000386
# remove all thing after # 
def remove_url_anchor(url):
    temp =  url.split("#")
    return temp[0]
