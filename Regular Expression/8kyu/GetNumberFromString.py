import re
def get_number_from_string(string):
    string = re.sub("\D+", "", string)
    return int(string) 
  
