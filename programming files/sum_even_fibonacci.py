#Bugs introduced: SM
a, b = 0, 1
sum_even = 0
while b < 4000000 #removed :
    if b % 2 == 0 #removed :
        sum_even ++= b #added +
    a, b = b, a+b

print(sum_even)

# answer should be 4613732
