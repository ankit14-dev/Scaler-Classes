no,l=map(str,input().split())
l=int(l)


def print0():
    for i in range(l):
        for j in range(l):
            if(j==0 or j==(l-1) or i==0 or i==l-1): print("*",end="")
            else: print(" ",end="")
        print()
def print1():
    for i in range(l): print("*")
def print2():
    for i in range(l):
        for j in range(l):
            if((j==0 and i>l/2) or (j==(l-1) and i<=l/2) or i==0 or i==l-1 or i==(l-1)/2): print("*",end="")
            else: print(" ",end="")
        print()
def print3():
    for i in range(l):
        for j in range(l):
            if(j==(l-1) or i==0 or i==l-1 or i==(l-1)/2): print("*",end="")
            else: print(" ",end="")
        print()
def print4():
    for i in range(l):
        for j in range(l):
            if((j==0 and i<=l/2) or j==(l-1) or i==(l-1)/2): print("*",end="")
            else: print(" ",end="")
        print()
def print5():
    for i in range(l):
        for j in range(l):
            if((j==0 and i<=l/2) or (j==(l-1) and i>l/2) or i==0 or i==l-1 or i==(l-1)/2): print("*",end="")
            else: print(" ",end="")
        print()
def print6():
    for i in range(l):
        for j in range(l):
            if(j==0 or (j==(l-1) and i>l/2) or i==0 or i==l-1 or i==(l-1)/2): print("*",end="")
            else: print(" ",end="")
        print()
def print7():
    for i in range(l):
        for j in range(l):
            if(j==(l-1) or i==0): print("*",end="")
            else: print(" ",end="")
        print()
def print8():
    for i in range(l):
        for j in range(l):
            if(j==0 or j==(l-1) or i==0 or i==l-1 or i==(l-1)/2): print("*",end="")
            else: print(" ",end="")
        print()
def print9():
    for i in range(l):
        for j in range(l):
            if((j==0 and i<=l/2) or j==(l-1) or i==0 or i==(l-1)/2 or i==l-1): print("*",end="")
            else: print(" ",end="")
        print()

for element in no:
    if(element=="1"): 
        print1()
        print()
    elif(element=="2"):
        print2()
        print()
    elif(element=="3"):
        print3()
        print()
    elif(element=="4"):
        print4()
        print()
    elif(element=="5"):
        print5()
        print()
    elif(element=="6"):
        print6()
        print()
    elif(element=="7"):
        print7()
        print()
    elif(element=="8"):
        print8()
        print()
    elif(element=="9"):
        print9()
        print()
    elif(element=="0"):
        print0()
        print()
