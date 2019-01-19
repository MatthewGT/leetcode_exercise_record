package leetcode100;

//public class volatileTest {
//    public static volatile int race = 0;
//    public static void increase(){
//        race++;
//    }
//    private static final int Threads_count = 20;
//
//    public static void main(String[] args){
//        Thread[] threads = new Thread[Threads_count];
//        for (int i = 0; i < Threads_count; i++) {
//            threads[i] = new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    for (int j = 0; j < 10000; j++) {
//                        increase();
//                    }
//                }
//            });
//            threads[i].start();
//
//        }
//        while (Thread.activeCount() > 1)
//            Thread.yield();
//        System.out.println(race);
//    }


//}



public class volatileTest{
    public static void main(String[] args){
        MyThread t = new MyThread();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);
        t1.start();
        t2.start();
        t3.start();
    }
}


class MyThread implements Runnable{
    private int ticket = 10;
    public void run(){
        while(this.ticket > 0){
            System.out.println(Thread.currentThread().getName() + " sell ticket " + this.ticket--);
        }
    }
}

