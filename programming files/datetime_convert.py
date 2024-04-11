from datetime import datetime

# bugs introduced: NP
date_str = "2022-03-17 10:45:30" #start time
date_obj = datetime.strptime(date_str, '%Y-%m-%d %H:%M:%S') #datetime built in function
formatted_date = date_obj.strftime('%m/%d/%Y %H:%M:%S') #datetime built in function

print(formatted_date)
