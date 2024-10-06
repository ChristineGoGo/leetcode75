def lengthOfLIS(nums):
    i, j = 1, 0
    mem = [1 for i in range(len(nums))]
    while i < len(nums) and j <= i:
            if i == j:
                i += 1
                j = 0
            else:
                if nums[i] > nums[j]:
                    if mem[i] <= mem[j]:
                        # print(f"nums[i]: {nums[i]} is greater than nums[j]:{nums[j]}")
                        mem[i] = mem[j] + 1
                    # print(f"mem is now: {mem}")
                j += 1
    # print(mem)
    return max(mem) 

print(lengthOfLIS(nums=[3, 4, -1, 0, 6, 2, 3]))

