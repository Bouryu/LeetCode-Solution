class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        for ch in s:
            if ch == '[' or ch == '{' or ch == '(':
                stack.append(ch)
            elif  ch == ']':
                if stack == [] or '[' != stack.pop():
                    return False
            elif  ch == '}':
                if stack == [] or '{' != stack.pop():
                    return False
            elif  ch == ')':
                if stack == [] or '(' != stack.pop():
                    return False
            else:
                return False
        return stack == []