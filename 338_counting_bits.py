import math

def countBits(n):

    ans = [0 for i in range(n + 1)]
    
    def intToBits(num):
        if num == 0: return '0'
        if num == 1: return '1'

        curr_int = num
        rem = 0
        res = ''

        while curr_int > 0:
            rem = curr_int % 2
            res += str(rem)
            curr_int = curr_int // 2
        
        l_res = list(res)
        l_res.reverse()
        return ''.join(l_res)

    for i in range(n+ 1):
        curr_bit = intToBits(i)
        ones = curr_bit.count('1')
        ans[i] = int(ones)

    return ans






print(countBits(5))
