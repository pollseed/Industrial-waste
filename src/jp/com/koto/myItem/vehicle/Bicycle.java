package vehicle;

import java.util.Random;

public class Bicycle extends AbstVehicle {

    private final int FRICTION_VALUE = 4;
    private final double MINUTE_CONVERT_VALUR = 60;
    private final Double MOTHER = 15d;
    private final Double CROSS = 18d;
    private final Double ROAD = 20d;

    public void create() {
        if (isNull(super.range)) {
            throw new IllegalArgumentException();
        }
        try {
            super.time = super.range / super.speed * MINUTE_CONVERT_VALUR;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

    public Bicycle(Double range) {
        if (isNull(range)) {
            throw new IllegalArgumentException();
        }
        randomSpeed();
        super.move(range);
    }

    public Bicycle(Double range, Double speed) {
        if (isNull(range, speed)) {
            throw new IllegalArgumentException();
        }
        super.move(range, speed);
    }

    private void randomSpeed() {
        Random rand = new Random();
        super.speed = rand.nextInt(FRICTION_VALUE) + MOTHER;
    }

    private boolean isNull(Double range, Double speed) {
        return isNull(range) || isNull(speed);
    }

    private boolean isNull(Double value) {
        return value == null;
    }

    @Override
    public void move(Double range, Double speed) {
        super.move(range, speed);
    }

    @Override
    public void move(Double range) {
        super.move(range);
    }

}
