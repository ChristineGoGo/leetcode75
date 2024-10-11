def increasingTriplet(nums):
        left, middle = float('inf'), float('inf')
        for i in range(len(nums)):
            if nums[i] > middle:
                return True
            elif nums[i] < left:
                left = nums[i]
            elif nums[i] > left and nums[i] < middle:
                middle = nums[i]
        return False



print(increasingTriplet([2, 1, 5, 0, 4, 6]))
