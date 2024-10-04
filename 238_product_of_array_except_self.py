def productExceptSelf(nums):
    # find the product of all the numbers to the left of nums[i]
    # and store them in the veriable left
    # find the product of all the numbers to the right of nums[i]
    # and store them in the variable right
    # multiply left[i] * right[i] to find the answers at answer[i]

    left = [0 for i in range(len(nums))]
    right = [0 for i in range(len(nums))]

    for i in range(0, len(nums)):
        if i == 0:
            left[i] = 1
        else:
            left[i] = left[i - 1] * nums[i -1]
    
    print(left)
    
    for i in range(len(nums) - 1, -1, -1):
        if i == len(nums) - 1:
            right[i] = 1
        else:
            right[i] = right[i + 1] * nums[i + 1]
    
    answer = [right[i] * left[i] for i in range(len(nums))]

    return answer