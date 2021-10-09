## Data Structure
1. Stack
    * Last In First Out
    * python에 별도의 자료구조 X, 리스트로 직접 구현, 리스트 함수 동일하게 사용

      
2. Queue
    * First In First Out 
    * python deque 사용
    
      <blockquote>
      appendleft() : 앞에서 넣기<br>
      popleft() : 앞에서 꺼내기<br> 
      append() : 뒤에서 넣기<br> 
      pop() : 뒤에서 꺼내기
      </blockquote>


3. Hash
    * Key - Value 자료구조
   * python dictionary 사용

      <blockquote>
        items() : key,  value 값을 한번에 탐색<br>
        get(key,  param) : key 값이 존재하면 value를 리턴,  존재하지 않으면 param을 리턴<br>
        keys() : key 값들의 리스트 리턴<br>
        values() : value 값들의 리스트 리턴
      </blockquote>
 

4. Heap
    * 완전이진트리 자료구조
    * python heapq 사용
       
       <blockquote>
        heappush() : 마지막 레벨의 가장 오른쪽 노드에 추가<br>
        heappop() : 최상위 노드(최소값) 삭제
        </blockquote>
    * default는 최소힙으로 작동, 최대힙의 효과를 발생시키기 위해서는 입력값의 부호를 반대로 바꿔야한다


5. Set
    * 중복을 허용하지 않는 리스트
    * python set() 생성자 이용
    
        <blockquote>
         add()<br>
         update()<br>
         discard()
         </blockquote>
     
<br>  

## 최단 경로 알고리즘
1. Floyd-Warshall 
    - 모든 노드에서 모든 노드로 가는 경로의 최단거리를 구하는 알고리즘
    - 경유 노드 k를 거쳐 가는 모든 경우의 비용을 연산함
   
      <blockquote>
       min(dis[i][j],  dis[i][k] + dis[k][j])
      </blockquote>     

2. Dijkstra
    - 특정 노드에서 모든 노드로 가는 최단거리를 구하는 알고리즘
    - 음의 간선이 없을 때 정상적으로 동작
    - priority queue 사용하여 현재 노드에서 방문하지 않은 노드 중 최단거리가 짧은 노드부터 처리

3. Bellman-Ford
    - 음수 간선을 처리하는 최단 경로 알고리즘, 음수 무한대 발생 가능
    - 매번 모든 간선을 전부 확인한다

<br>  

## Dynamic Programming 
* memoization
* top-down / bottom-up
* common trick

