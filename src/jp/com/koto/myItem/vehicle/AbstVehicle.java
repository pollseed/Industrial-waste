package jp.com.koto.myItem.vehicle;

public abstract class AbstVehicle implements IVehicle {

    protected Double range = null;

    protected Double speed = null;

    protected Double time = null;

    @Override
    public void move(Double range, Double speed) {
        move(range);
        this.speed = speed;
    }

    @Override
    public void move(Double range) {
        this.range = range;
    }

    public Double getSpeed() {
        return speed;
    }

    public Double getRange() {
        return range;
    }

    public Double getTime() {
        return time;
    }

}
