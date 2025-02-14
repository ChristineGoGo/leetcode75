def maxArea(self, height: List[int]) -> int:
    l, r = 0, len(height) - 1 
    max_area = 0
    while l < r:
            width = r - l
            length = min(height[r], height[l])
            area = width * length
            max_area = max(max_area, area)
            if height[l] < height[r]:
                l += 1
            else:
                r -= 1    
    return max_area