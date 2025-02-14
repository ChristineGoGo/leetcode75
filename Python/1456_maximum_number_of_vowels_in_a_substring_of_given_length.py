def maxVowels(s, k):
    vowels = {'a', 'e', 'i', 'o', 'u'}
    current_vowels, max_vowels, r = 0, 0, k - 1
    for i in range(k):
        if s[i] in vowels:
            current_vowels += 1
        
    max_vowels = max(current_vowels, max_vowels)
    if max_vowels == k:
        return max_vowels

    for l in range(len(s) - k + 1):
        print(f"l is {l} and s[l] is {s[l]} , r is {r} and s[r] is {s[r]}")
        if s[r] in vowels:
            current_vowels += 1
        if s[l] not in vowels and max_vowels >= 1:
            current_vowels -= 1
       
        r += 1
        max_vowels = max(current_vowels, max_vowels)

        if max_vowels == k:
            return max_vowels
    
    return max_vowels

print(maxVowels("leetcode", 3))

