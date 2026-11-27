def close(temps,target):
    left=0
    right=len(temps)-1
    
    best_pair=(temps[left],temps[right])
    best_diff=abs(temps[left]+temps[right]-target)
    
    while left<right:
        csum=temps[left]+temps[right]
        cdiff=abs(csum-target)
        if cdiff<best_diff:
            best_diff=cdiff
            best_pair=(temps[left],temps[right])
        if csum<target:
            left +=1
        elif csum>target:
            right-=1
        else:
            return (temps[left],temps[right])
    return best_pair
    
temps=list(map(int, input("enter elements:").split(",")))
if len(temps)<2:
    print("Array must contain atleast two elements")
else:
    target=int(input("enter target"))
    result=close(temps,target)
    print(result)