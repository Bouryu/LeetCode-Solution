class Solution:
    def countGoodRectangles(self, rectangles: List[List[int]]) -> int:
        a = [min(item) for item in rectangles]
        return a.count(max(a))