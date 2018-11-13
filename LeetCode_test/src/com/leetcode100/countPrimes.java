package leetcode100;

//Count the number of prime numbers less than a non-negative number, n.


public class countPrimes {
    public static int countPrimes(int n) {
        if(n < 3)
            return 0;
        boolean[] assump = new boolean[n];
        int count = 0;
        for(int i = 2;i < n;i++){
            if(!assump[i]){
                count++;
                for(int j = 2*i;j < n;j +=i){
                    assump[j] = true;
                }
            }
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(countPrimes(10));
    }
}
