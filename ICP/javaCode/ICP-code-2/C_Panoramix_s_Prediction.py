

import math


def isPrime(n):
    for i in range(2,n):
        if n%i==0: return False
    return True
def nextPrime(n):
    while(True):
        if(isPrime(n)): return n
        n+=1
    
n,m=map(int,input().split())
# print(nextPrime(n+1))
print("YES") if(m==nextPrime(n+1)) else print("NO")