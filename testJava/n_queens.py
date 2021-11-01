# import decimal as dec
# import itertools as it
# import collections as coll
import sys
import math as mt

import random as rd

# import bisect as bi
import time

sys.setrecursionlimit(1000000)

# import numpy as np


def uno():
    return int(sys.stdin.readline().strip())


def dos():
    return sys.stdin.readline().strip()


def tres():
    return map(int, sys.stdin.readline().strip().split())


def cuatro():
    return sys.stdin.readline().strip().split()


# Starting Time
time1 = time.time()


# def nQueen(brd, col, n):
#     if col >= n:
#         return True
#     for i in range(n):
#         if (ld[i - col + n - 1] != 1 and rd[i + col] != 1) and rw[i] != 1:
#             brd[i][col] = 1
#             ld[i - col + n - 1] = rd[i + col] = rw[i] = 1
#             if nQueen(brd, col + 1, n):
#                 return True
#             brd[i][col] = 0
#             ld[i - col + n - 1] = rd[i + col] = rw[i] = 0
#     return False


def nQueenPolynomial(brd, n):
    if n == 2 or n == 3:
        print("Impossible Case")
        return
    pd, nd, rw, cl, sp = (
        [0 for i in range(2 * n + 1)],
        [0 for i in range(2 * n + 1)],
        [i for i in range(n)],
        [i for i in range(n)],
        1,
    )
    rd.shuffle(cl)
    # print(rw, cl)
    for i in range(n):
        pd[rw[i] + cl[i]] += 1
        nd[rw[i] - cl[i] + n - 1] += 1
    # print(pd, nd)
    while sp != 0:
        sp = 0
        for i in range(n):
            for j in range(i + 1, n):
                if (
                    pd[rw[i] + cl[i]] > 1
                    or nd[rw[i] - cl[i] + n - 1] > 1
                    or nd[rw[j] - cl[j] + n - 1] > 1
                    or pd[rw[j] + cl[j]] > 1
                ):
                    pd[rw[i] + cl[i]] -= 1
                    nd[rw[i] - cl[i] + n - 1] -= 1
                    pd[rw[j] + cl[j]] -= 1
                    nd[rw[j] - cl[j] + n - 1] -= 1
                    cl[i], cl[j] = cl[j], cl[i]
                    if (pd[rw[i] + cl[i]] == 0 and nd[rw[i] - cl[i] + n - 1] == 0) or (
                        pd[rw[j] + cl[j]] == 0 and nd[rw[j] - cl[j] + n - 1] == 0
                    ):
                        pd[rw[i] + cl[i]] += 1
                        nd[rw[i] - cl[i] + n - 1] += 1
                        pd[rw[j] + cl[j]] += 1
                        nd[rw[j] - cl[j] + n - 1] += 1
                        sp += 1
                    else:
                        cl[i], cl[j] = cl[j], cl[i]
                        pd[rw[i] + cl[i]] += 1
                        nd[rw[i] - cl[i] + n - 1] += 1
                        pd[rw[j] + cl[j]] += 1
                        nd[rw[j] - cl[j] + n - 1] += 1
    for i in range(n):
        brd[rw[i]][cl[i]] = 1
        print(*brd[i])


######## ? CODE STARTS FROM HERE ########
n = uno()
brd = [[0 for i in range(n)] for i in range(n)]
# ld, rd, rw = (
#     [0 for i in range(2 * n + 1)],
#     [0 for i in range(2 * n + 1)],
#     [0 for i in range(2 * n + 1)],
# )

nQueenPolynomial(brd, n)


# if nQueen(brd, 0, n):
#     for i in brd:
#         print(*i)
# else:
#     print("Impossible Case")

# End Time
time2 = time.time()
time = (
    str(round((time2 - time1) * 1000, 3)) + "ms"
    if (round((time2 - time1) * 1000, 3)) < 1000
    else str(round(time2 - time1, 3)) + "s"
)
print("\nTime Taken:", time)
