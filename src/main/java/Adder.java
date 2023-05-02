public class Adder implements Runnable{
    int num1;
    int num2;

    @Override
    public void run() {
        System.out.println(num1+num2);
    }
}
