package testJava;
/**
 * 
 * @author Mustansir
 *def cn(a):
    return ord(a)-ord('a')


for _ in range(int(input())):
    s = input()
    p = input()
    d, n, m = [0]*26, len(s), len(p)
    ans, a1, a2 = "", p[0], p[m-1]
    for i in range(n):
        d[cn(s[i])] += 1
    if len(p) == 1:
        ans = ""
        for i in range(26):
            while d[i] > 0:
                ans += chr(i+ord('a'))
                d[i] -= 1
        print(ans)
        continue
    for i in range(m):
        d[cn(p[i])] -= 1
    b = False
    if cn(a1) > cn(min(p)):
        b = True
    for i in range(26):
        while d[i] != 0:
            ans += chr(i+ord('a'))
            d[i] -= 1
    '''
    d1 = []
    for i in range(n):
        t = ans[0:i]+p+ans[i:]
        d1.append(t)
    print(min(d1))
    '''
    n, i = len(ans), 0
    while ans[i] == 'a':
        i += 1
    while i < n and cn(ans[i]) < cn(a1):
        i += 1
    if b:
        # print(0)
        d = []
        while i < n and cn(ans[i]) <= cn(a1):
            d.append(ans[0:i]+p+ans[i:])
            i += 1
        d.append(ans[0:i]+p+ans[i:])
        print(min(d))  # , d)
    else:
        # print(1)
        while i < n and cn(ans[i]) <= cn(a1):
            i += 1
        print(ans[0:i]+p+ans[i:])
 */
public class SKMP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
