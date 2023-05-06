for _ in range(0,int(input())):
    n,mod=list(map(int, input().split()))
    a=1
    b=1
    for i in range(n):
        c=(a%mod+b%mod)%mod
        a=b
        b=c
    print((2*c)%mod)
