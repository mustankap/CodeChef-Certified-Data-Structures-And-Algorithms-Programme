for _ in range(int(input())):
    ab=list(map(int,input().split()))
    a,b=ab[0],ab[1]
    s=list(map(int,input()))
    n=len(s)
    v=[]
    for i in range(n):
        if s[i] == 0:
            if i == 0  or  s[i-1] == 1:
               v.append(0)
            v[-1]=v[-1]+1
    
    if len(v)==1 and v[0]==n:
        print(0)
        continue
    
    ans=a

    if v!=[]:
        if s[0] == 0 and  s[n-1] == 0:
            n = v[-1]
            v.pop(-1)
            
            if v==[]:
                v.append(n)
            else:
                v[0]=v[0]+n
        sorted(v)
        v.pop(-1)
        n=len(v)
        for i in range(n):
            ans+=min(b*v[i],a)
    print(ans)
                
                


            
        