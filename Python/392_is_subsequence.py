def isSebsequence(s, t):
        res = ""
        pointer_1, pointer_2 = 0, 0

        while pointer_1 < len(s) and pointer_2 < len(t):
            if s[pointer_1] == t[pointer_2]:
                res += s[pointer_1]
                pointer_1 += 1
                pointer_2 += 1
            else:
                pointer_2 += 1

        result = True if res == s else False

        return result 