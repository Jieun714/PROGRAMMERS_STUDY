package DFS_BFS;

import java.util.*;

//타겟 넘버
class Target {
    static int answer;
    public static int solution(int[] numbers, int target) {
    	answer=0; //초기화해줘야 누적으로 추가가 안됨.
        dfs(numbers, target, 0, 0);
        return answer;
    }
    
    //깊이 우선 탐색
    public static void dfs(int[] numbers, int target, int depth, int sum){
        
        if(depth==numbers.length){
            if(sum==target){
                answer++; //합과 타겟이 동일한 수를 더함
            }
            return;
        }
        
//        sum -= numbers[depth];
        dfs(numbers, target, depth+1, sum-numbers[depth]); //노드의 값을 빼고 
       
//        sum += numbers[depth];
//        sum -= (-1 * numbers[depth]);
        
        dfs(numbers, target, depth+1, sum + numbers[depth]); //노드의 값을 더하고
    }
    
    public static void main(String[] args) {
    	//test case
    	int test1[] = { 1,1,1,1,1 };
    	int target1 = 3;  //ans=5
    	
    	int test2[] = { 4,1,2,1 };
    	int target2 = 4;  //ans=4
    	
    	
    	solution(test1, target1);   	
    	System.out.println(answer);
    	
    	solution(test2, target2);
    	System.out.println(answer);
    }
}

