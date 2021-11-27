package tp3.ex2;

public class StaticCounter {
    private static int counter = 0;


    public static synchronized void increment(){
        counter++;
        System.out.println(counter);

    }
}
