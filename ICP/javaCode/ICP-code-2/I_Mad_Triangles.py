n=int(input())
for i in range(n):
    for j in range(i+1):
        print("*",end="")
    print()
print()

for i in range(n):
    for k in range(n-1-i):
        print(" ",end="")
    for j in range(i+1):
        print("*",end="")
    print()
print()

no=1
for i in range(n):
    for k in range(n-1-i):
        print(" ",end="")
    for j in range(no):
        print("*",end="")
    print()
    no+=2
print()

for i in range(n):
    for j in range(i+1):
        if(j==0 or j==i or i==n-1): print("*",end="")
        else: print(" ",end="")
    print()
print()

for i in range(n):
    for k in range(n-1-i):
        print(" ",end="")
    for j in range(i+1):
        if(j==0 or j==i or i==n-1): print("*",end="")
        else: print(" ",end="")
    print()
print()

no=1
for i in range(n):
    for k in range(n-1-i):
        print(" ",end="")
    for j in range(no):
        if(j==0 or j==no-1 or i==n-1): print("*",end="")
        else: print(" ",end="")
    print()
    no+=2