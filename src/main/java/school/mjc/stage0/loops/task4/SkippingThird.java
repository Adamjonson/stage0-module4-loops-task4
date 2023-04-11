package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
        int number = 1;
        for (int i = 0; i <= lastPrinted; i++){
            if (number % 3 == 0){
                continue;
            }
            System.out.println(number);
        }
    }
}
