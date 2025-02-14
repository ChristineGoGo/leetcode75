def findDifference(nums1, nums2):
    def inNums1Only(list1, list2):
        list1only = set()
        inlist2 = set()

        for num in list2:
            inlist2.add(num)
        
        for num in list1:
            if not (num in inlist2):
                list1only.add(num)
        
        return list(list1only)
    
    return [inNums1Only(nums1, nums2), inNums1Only(nums2, nums1)]



print(findDifference([1, 2, 3, 4], [8, 2, 3, 6, 7]))
print(findDifference([1, 2, 3], [2, 4, 6]))

