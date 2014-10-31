package jp.com.argorithm;

public class HowToUse {
    // HOT TO USE
    public static void main(String[] args) {

        // Give the specified array
        final int[] is = { 23, 9, 111, 28, 23, 22, 999, 1, 23, 66, 4, 5, 2, 22, 12, 3, 65, 91 };
        EasySort specified = new EasySort(is);
        specified.bubble();
        for (int i : specified.getSorted()) {
            System.out.println(i);
        }
        specified.selection();
        for (int i : specified.getSorted()) {
            System.out.println(i);
        }

        // use the random sequences
        EasySort random = new EasySort(100, 1000);
        random.bubble();
        for (int i : random.getSorted()) {
            System.out.println(i);
        }
        random.selection();
        for (int i : random.getSorted()) {
            System.out.println(i);
        }

    }
}
