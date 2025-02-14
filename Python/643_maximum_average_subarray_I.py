

def findMaxAverage(nums, k):
    length = k
    current_sum = sum(nums[:k])
    total_max_sum = current_sum

    for i in range(len(nums) - k):
        current_sum = current_sum - nums[i] + nums[k]
        k += 1
        total_max_sum = max(current_sum, total_max_sum)

    return total_max_sum / length

print(findMaxAverage([1, 12, -5, -6, 50,3], 4))

