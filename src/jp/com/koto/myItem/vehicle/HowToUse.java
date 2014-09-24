package vehicle;

public class HowToUse {

    private static double RANGE = 5.8d;

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(RANGE);
        bicycle.create();
        System.out.println(bicycle.time);
    }

}
