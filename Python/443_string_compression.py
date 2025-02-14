def compress(chars):
    s = ""
    for i in range(len(chars)):
        if chars.count(chars[i]) == 1:
            s += chars[i]
        else:
            if chars[i] not in s:
                s += chars[i]
                s += " "
                counts =  str(chars.count(chars[i]))
                for c in counts:
                    s += c

    print(s)
    list_s = [s[i] for i in range(len(s)) if s[i] != " " ]
    print(list_s)
    return len(list_s)


# print(compress(["a","b","b","b","b","b","b","b","b","b","b","b","b"]))

word= "wwwwaaadexxxxxx"
curr_count, l, s, i = 0, len(word) - 1, "", 0

while i < l:
    print(i)
    if word[i] != word[i +1]:
        s += word[i]
        s += str(curr_count)
        curr_count = 0
    else:
        curr_count += 1
    
    i += 1

print(s)

