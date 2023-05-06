t=int(input())
for _ in range(t):
    n=int(input())
    s=input()
    count=0
    for i in range(len(s)):
        if s[i]=="1":
            count+=1
    print((count*(count+1))//2)
