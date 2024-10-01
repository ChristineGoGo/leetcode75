def reverseWords(s):
    list_string = s.strip().split(" ")
    modified_list_string = [list_string[i] for i in range(0, len(list_string)) if list_string[i] != ""]
    reversed_list_string = modified_list_string[::-1]
    result = " ".join(reversed_list_string)

    return result

print(reverseWords("Hello   World!"))