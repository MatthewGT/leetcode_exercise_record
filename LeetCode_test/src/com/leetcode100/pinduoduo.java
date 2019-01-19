import java.util.*;
public class pinduoduo{
	
    public static void findMostOne(int[][] A){
        int n = A.length;
        int m = A[0].length;
        int i=0,j=m-1;
        while (i < n && j >= 0)
        {
            if(A[i][j] == 1){
                j--;
            }
            else {
                i++;
            }
        }
        for(int k = 0;k < n;k++){
            if(A[k][j+1] == 1){
                System.out.println("[" + (k+1) + "," + (m-j-1) + "] ");
            }

        }

    }


        public static boolean checkValid(String A) {
            Stack<Character> stack = new Stack<Character>();
                char[] bytes = A.toCharArray();
                stack.push(bytes[0]);
                for (int i = 1; i < bytes.length; ++i) {
                    Character c1 = stack.peek();
                    Character c2 = bytes[i];
                    if ((c1.toString().equals("(") && c2.toString().equals(")"))
                            || (c1.toString().equals("[") && c2.toString().equals("]"))
                            || (c1.toString().equals("{") && c2.toString().equals("}"))) {
                        stack.pop();
                    } else {
                        stack.push(c2);
                    }
                }
                boolean isMatch = stack.isEmpty();
                return isMatch;
        }


    public static boolean move(int direction){
        switch (direction){
            case 0:
                return false;
            case 1:
                return false;
            case 2:
                return false;
            case 3:
                return false;


        }
        return false;
    }

    public static int findArea (int x,int y,Set<String> set){
        set.add(x+","+y);
        if(!set.contains(x+","+(y+1)) && move(0)) {
        findArea (x,y+1,set);
        move(2);
        }
        if(!set.contains((x+1)+","+y) && move(1)) {
                findArea (x+1,y,set);
                move(3);
                }
                if(!set.contains(x+","+(y-1)) && move(2)) {
                findArea (x,y-1,set);
                move(0);
                }
                if(!set.contains((x-1)+","+y) && move(3)) {
                findArea (x-1,y,set);
                move(1);
        }
        return set.size();
        }

    public static int[] findsmallestRange(List<List<Integer>> A) {
        int maxValue = Integer.MIN_VALUE, maxIndex = 0;
        int current[] = new int[A.size()];

        for(int i = 0; i < A.size(); i++) {
            if (A.get(i).get(current[i]) > maxValue) {
                maxValue = A.get(i).get(current[i]);
            }
        }
        int range[] = new int[2];
        range[0] = 0; range[1] = 0;
        int result = Integer.MAX_VALUE;
        boolean flag = true;
        while (flag) {
            int minIndex = 0, minValue = Integer.MAX_VALUE;
            for (int i = 0; i < A.size(); i++) {
                while (current[i] + 1 < A.get(i).size() && A.get(i).get(current[i] + 1) <= maxValue) {
                    current[i]++;
                }
                if (A.get(i).get(current[i]) < minValue) {
                    minIndex = i;
                    minValue = A.get(i).get(current[i]);
                }
            }
            if (maxValue - minValue < result)  {
                result = maxValue - minValue;
                range[0] = minValue;
                range[1] = maxValue;
            }
            if (current[minIndex] == A.get(minIndex).size() - 1) {
                flag = false;
            } else {
                current[minIndex]++;
                maxIndex = minIndex;
                maxValue = A.get(maxIndex).get(current[maxIndex]);
            }
        }
        return range;
    }

    public static int test(){
        int x = 1;
        try {
            x++;
            return x;
        }
        finally {
            x+=2;
            return x;
        }
    }

    public static void main(String[] args){

        System.out.println(test());

        //////test for exercise 1
        int[][] test =
        {{0,0,0,0,0,0,0,1,1,1,1,1},
        {0,0,0,0,1,1,1,1,1,1,1,1},
        {0,0,0,0,0,0,1,1,1,1,1,1},
        {0,0,0,0,0,0,0,0,0,1,1,1},
        {0,0,0,0,0,0,0,1,1,1,1,1},
        {0,0,0,0,1,1,1,1,1,1,1,1}};
        System.out.println("-------test result for exercise 1--------");
        findMostOne(test);

        /////test for exercise 2
        System.out.println("-------test result for exercise 2--------");
        System.out.println(checkValid("{[(2+3)*(1-3)] + 4}*(14-3)"));

        /////test for exercise 3
        System.out.println("-------test result for exercise 3--------");
        System.out.println(findArea(0,0,new HashSet<>()));

        ////test for exercise 4
        System.out.println("-------test result for exercise 4--------");
        List<List<Integer>> A = new LinkedList<>();
        List<Integer> A1 = new LinkedList<>(Arrays.asList(1, 3, 5));
        List<Integer> A2 = new LinkedList<>(Arrays.asList(4, 8));
        List<Integer> A3 = new LinkedList<>(Arrays.asList(2, 5));
        A.addAll(Arrays.asList(A1,A2,A3));
        int[] result = findsmallestRange(A);
        System.out.println("[" + result[0] + "," + result[1] + "]");



    }
}
