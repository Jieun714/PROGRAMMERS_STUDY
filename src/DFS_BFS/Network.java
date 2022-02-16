package DFS_BFS;

//프로그래머스 DFS/BFS 네트워크
public class Network {
	static int answer;  //네트워크 갯수
	static int[][] computers;  //노드를 담고 있는 배열
	static boolean[] visited; //방문체크 하기 위한 배열
	
	public static int solution2(int n, int[][] computers) {
        answer = 0;
        visited = new boolean[n];
        
        for(int i=0; i<computers.length; i++) {
        	if(visited[i]==false) {  //방문하지 않았을 시
        		answer++;
        		dfs(computers, i, visited);
        	}
        }
        return answer;
	}
	
	public static void dfs(int[][] computers, int n, boolean[] visited) {
		visited[n] = true;  //방문했다고 변경
		for(int i=0; i<computers.length; i++) {
			if(visited[i]==false && computers[n][i]==1) {
				dfs(computers, i, visited);
			}
		}
	}
	
	public static void main(String[] args) {
		int n1=3;
		int[][] computers1 = { {1,1,0}, {1,1,0},{0,0,1}};
		int n2=3;
		int[][] computers2 = { {1,1,0}, {1,1,1},{0,1,1}};
		
		solution2(n1, computers1);
		System.out.println(answer);
		
		solution2(n2, computers2);
		System.out.println(answer);
	}
}
