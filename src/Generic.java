public class Generic <A> {

    private A car;

    public Generic(A car) {
        this.car = car;

    }
    @Override
    public String toString() {
        return "car"  + car;
    }

    public A getcar() {
        return car;
    }

}
