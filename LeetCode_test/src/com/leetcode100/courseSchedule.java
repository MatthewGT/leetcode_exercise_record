package leetcode100;
import java.util.*;

public class courseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites){
        ArrayList[] graph = new ArrayList[numCourses];
        int[] indegree = new int[numCourses];
        for(int i = 0;i < numCourses;i++){
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < prerequisites.length; i++) {
            graph[prerequisites[i][1]].add(prerequisites[i][0]);
            indegree[prerequisites[i][0]]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if(indegree[i] == 0)
                queue.offer(i);
        }
        int count = 0;
        while(!queue.isEmpty()){
            Integer curr = queue.poll();
            count++;
            ArrayList<Integer> neighbors = graph[curr];
            for(int i = 0;i < neighbors.size();i++){
                indegree[neighbors.get(i)]--;
                if(indegree[neighbors.get(i)] == 0){
                    queue.offer(neighbors.get(i));
                }
            }
        }
        return count == numCourses;
    }
}
