package leetcode100;

import java.util.*;

class Interval{
    int start;
    int end;
    Interval(int x, int y){
        this.start = x;
        this.end = y;
    }
}

public class mergeInterval {

    public static class intervalComparator implements Comparator<Interval>{
        public int compare(Interval a,Interval b){
            return a.start - b.start;
        }

    }

    public static void printList(LinkedList<Interval> list){
        for(Interval ite:list){
            System.out.println("[" + ite.start + "," + ite.end + "]" + " ");
        }
    }

    public static LinkedList<Interval> merge(LinkedList<Interval> list){
        Collections.sort(list,new intervalComparator());
        LinkedList<Interval> res = new LinkedList<>();
        for(Interval ite:list){
            if(res.isEmpty() || ite.start > res.getLast().end){
                res.add(ite);
            }
            else{
                res.getLast().end = res.getLast().end > ite.end?res.getLast().end:ite.end;
            }
        }
        return res;

    }

    public static void main(String[] args){
        LinkedList<Interval> test = new LinkedList<>();
        test.addLast(new Interval(4,7));
        test.addLast(new Interval(5,10));
        test.addLast(new Interval(11,24));
        printList(merge(test));
    }

}
