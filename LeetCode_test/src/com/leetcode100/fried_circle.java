package leetcode100;


////use dfs and a visited array
public class fried_circle
{
    public int findCircleNum(int[][] M) {
        if(M.length == 0 || M.length != M[0].length)
            return 0;
        int[] visited = new int[M.length];
        int res = 0;
        for(int i = 0;i < M.length;i++){
            if(visited[i] == 0){
                dfs(M,visited,i);
                res++;
            }
        }
        return res;
    }

    public void dfs(int[][] M,int[] visited,int i){
        for(int j = 0;j < M.length;j++){
            if(M[i][j] == 1 && visited[j] == 0){
                visited[j] = 1;
                dfs(M,visited,j);
            }
        }
    }
}
