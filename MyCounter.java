package tp3.ex2;

public class MyCounter {

    //todo : implement me
    public synchronized void count(){
        for(int i=0;i<500;i++){
            StaticCounter.increment();
        }
        System.out.println("finish!");
    }
}
