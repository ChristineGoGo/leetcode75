def largestAltitude(self, gain: List[int]) -> int:
        altitudes = [-float(inf) for i in range(len(gain) + 1)]
        altitudes[0] = 0
        
        for i in range(len(gain)):
            altitude = gain[i] + altitudes[i]
            altitudes[i+1] = altitude

        return max(altitudes)
        