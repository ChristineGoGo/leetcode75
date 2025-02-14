def maxOperations(nums, k):
    print(nums)
    n_nums = sorted(nums)
    l,r,operations = 0, len(nums) - 1, 0

    while l < r:
        if n_nums[l] + n_nums[r] == k:
            l += 1
            r -= 1
            operations += 1
        elif n_nums[l] + n_nums[r] < k:
            l += 1
        else:
            r -= 1
    
    return operations

print(maxOperations([3, 1, 3, 4, 3], 6))
