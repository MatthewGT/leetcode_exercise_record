package leetcode100;
import java.util.*;

public class permutationString {
    public static ArrayList<String> Permutation(String str) {
        ArrayList<String> result = new ArrayList<String>() ;
        if(str==null || str.length()==0) { return result ; }
        TreeSet<String> temp = new TreeSet<>() ;
        helper(str, 0, temp);
        result.addAll(temp) ;
        return result ;
    }

    public static void helper(String str, int begin, TreeSet<String> result) {
        if(begin == str.length()-1) {
            result.add(str) ;
            return;
        }
        for(int i=begin ; i<str.length() ; i++) {
            str = swap(str, begin, i) ;
            //System.out.println(str);
            helper(str, begin+1, result);
            str =  swap(str, begin, i) ;
        }

    }

    public static String swap(String str, int a, int b) {
        char[] temp = str.toCharArray();
        char t = temp[a];
        temp[a] = temp[b];

        temp[b] = t;
        return String.valueOf(temp);
    }

    public static void main(String[] args){
        String test = "abc";
        ArrayList<String> res = Permutation(test);
        for(String ite:res){
            System.out.println(ite);
        }
    }
}