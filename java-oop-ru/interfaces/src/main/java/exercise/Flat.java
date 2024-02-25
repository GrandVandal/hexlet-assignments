package exercise;

// BEGIN
public final class Flat implements Home {

    private final double area;
    private final double balconyArea;
    private final int floor;

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    @Override
    public double getArea() {
        return area + balconyArea;
    }

    @Override
    public int compareTo(Home anotherHome) {
        return Double.compare(this.getArea(), anotherHome.getArea());
    }

    @Override
    public String toString() {
        return String.format("Квартира площадью %.1f метров на %d этаже", this.getArea(), floor);
    }
}
// END
