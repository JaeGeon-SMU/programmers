def solution(s):
    ans = ''
    for word in s.split(" "):
        for i, p in enumerate(word):
            if i % 2 == 0:
                ans += p.upper()
            else:
                ans += p.lower()
        ans += ' '

    return ans[:-1]