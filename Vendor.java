package tp3.ex3;

public class Vendor extends Thread{

    private ISISandwich isiSandwich;

    public Vendor(String s, ISISandwich isiSandwich) {
        super(s);
        this.isiSandwich = isiSandwich;
    }

    @Override
    public void run() {
        try {
            sleep(2000);

                System.out.println("Vendor "+this.getName()+" said 'isi sandwich is ready'");
       synchronized (isiSandwich){
                isiSandwich.notifyAll();
                //todo : prepare a sandwich, set it as ready and notify a student
                }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }
}
