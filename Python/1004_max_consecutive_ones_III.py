def longestOnes(nums, k):
    max_ones, current_ones, zeros_flipped, left = 0, 0, 0, 0

    for right in range(len(nums)):
        print(f"this is the {right} loop")
        if nums[right] == 0:
            print(f"nums right is zero")
            zeros_flipped += 1
            if zeros_flipped > k:
                if nums[left] == 1:
                    while nums[left] == 1:
                        current_ones -= 1
                        left += 1
                else:
                    zeros_flipped -= 1
                    left += 1
            else:
                current_ones += 1
                max_ones = current_ones if current_ones >= max_ones else max_oness
        else:
            current_ones += 1
            max_ones = current_ones if current_ones >= max_ones else max_ones
        
        print(f"current_ones: {current_ones}, zeros_flipped:{zeros_flipped}, max_ones:{max_ones}, left:{left}")

                
    
    return max_ones


print(longestOnes([0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], 3))
