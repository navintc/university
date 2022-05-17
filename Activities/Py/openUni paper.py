import math

values = []
value = 0
total = 0.0
average = 0.0
iters = 0

def numCheck(a):
    try:
        check_int = isinstance(int(a), int)
        check_float = isinstance(float(a), float)
        if (check_int == True) or (check_float == True):
            return True
        else:
            return False
    except:
        return False

while True:
    print ("Enter a price")
    value = input()

    
    if (numCheck(value) == False):
        print ("Not a number")
        continue

    value = int(value)
    if value == 0:
        print ("List ended")
        break
    if value < 0:
        print ("Prices must be positive")
        continue

    values.append(value)

for k in values:
    total += k

average = total / len(values)
high = values[0]
low = values[0]
highValues = 0
lowValues = 0

for i in values:
    if (i < low):
        low = i
    if (i > high):
        high = i
        
    if (i < average):
        lowValues+=1
    elif (i >= average):
        highValues+=1

print ("Total cost: ", total)
print ("Average cost: ", average)
print ("Highest price: ", high)
print ("Lowest price: ", low)
print ("# of prices >= price: ", highValues)
print ("# of prices < price: ", lowValues)

    
        
