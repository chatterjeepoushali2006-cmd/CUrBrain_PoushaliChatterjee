num = int(input("Enter number: "))
rev=0
lst=[]
while num > 0:
    rem = num%10
    rev=(rev*10)+rem
    num=num//10

while rev > 0:
    rem = rev%10
    if rem%2!=0:
        lst.append(rem)
    else:
        lst.append(0)
    rev=rev//10

print(lst)