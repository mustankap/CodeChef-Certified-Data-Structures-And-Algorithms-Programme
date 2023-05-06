# mustansir code ref
MOD = 1000000007
n, m = list(map(int, input().split()))
mstr = input().split()
a = [0 for _ in range(len(mstr)+1)]
for i in range(len(mstr)):
  a[i] = int(mstr[i])
a.sort()
sum = 1
d = n-m
pows = [0 for _ in range(1001)]
c=[[0 for i in range(1001)] for j in range(1001)]
pows[0]=1
pows[1]=1

for i in range(2,1001):
  pows[i] = (pows[i - 1] * 2) % MOD

c[0][0] = 1

for i in range(1,1001):
  c[i][0] = 1
  for j in range(1, i+1):
    c[i][j] = (c[i - 1][j] + c[i - 1][j - 1]) % MOD

for i in range(1, m+1):
    sum = (sum * c[d][a[i] - a[i - 1] - 1]) % MOD
    d -= a[i] - a[i - 1] - 1

for i in range(2, m+1):
    sum = (sum * pows[a[i] - a[i - 1] - 1]) % MOD

print(sum)