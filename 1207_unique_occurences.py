def uniqueOccurrences(self, arr: List[int]) -> bool:
    uniques = {}
    for num in arr:
        uniques[num] = arr.count(num)
    
    res = list(uniques.values())
    return len(res) == len(set(res))