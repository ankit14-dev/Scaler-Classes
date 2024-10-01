
def is_lucky_number(x):
    return all(c in '47' for c in x)

def is_nearly_lucky_number(n):
    n_str = n
    lucky_digit_count = sum(1 for c in n_str if c in '47')
    return is_lucky_number(str(lucky_digit_count))

n=input()
print("YES") if(is_nearly_lucky_number(n)) else print("NO")

