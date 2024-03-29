import sys
sys.stdin = open("../input.txt",  "r")

n,  m = map(int,  input().split())
dis = [[5000] * (n + 1) for _ in range(n + 1)]

# 인접행렬 초기화 작업
for i in range(1,  n + 1):
    dis[i][i] = 0
for x in range(m):
    i,  j,  cost = map(int,  input().split())
    dis[i][j] = cost

# 플로이드 와샬 알고리즘 구현부
for k in range(1,  n + 1):
    for i in range(1,  n + 1):
        for j in range(1,  n + 1):
            dis[i][j] = min(dis[i][k] + dis[k][j])

# 출력
for i in range(1,  n + 1):
    for j in range(1,  n + 1):
        if dis[i][j] == 5000:
            print("M",  end="")
        else:
            print(dis[i][j],  end="")
        print()



