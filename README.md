자바에서 

int a = 2;
int a = 3;

하면 값이 3으로 덮어씌워지지가 않던데 자바는 한번 변수가 선언되면 메인메소드에서 값 변경이 불가능한지?

-[J]
```
int a = 2;
a= 3;

print -> 3

상황에 따라 조금 다를 것 같은데 full code 있어?
```
-[K]
```
풀코드라기 보다 그냥 하다가 안되서 물어보는건데
방금 위에꺼 sysout(a); 했더니 3나오더라 
그럼 int a 와 a 는 뭐가 다른건지??
```
-[J]
```
3 나오는게 정상임

int a = 2; --> int(숫자) 형 변수 a 선언 하여 2을 집어 넣는다.
a= 3       --> 이미 선언한 a에 3를 집어 넣는다.

int a = 3;  --> int(숫자)형 변수 a를 또 선언해서 3을 넣는다. (이미 선언한 a는 다른 디스크에 떠다니고있다가 버려짐) 


sysout(a)   --> 3이 나온다.

```


4월 15일- 16일 
https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AW-hOY5KeEIDFAVg&categoryId=AW-hOY5KeEIDFAVg&categoryType=CODE
(SW expert 석찬이의 받아쓰기)



분할정복 (Divide and conqure
https://ko.khanacademy.org/computing/computer-science/algorithms/merge-sort/a/divide-and-conquer-algorithms
