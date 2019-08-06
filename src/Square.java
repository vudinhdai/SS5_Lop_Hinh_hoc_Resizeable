public class Square extends Rectangle implements Resizeable {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public Square(double width, double height, double side) {
        super(width, height);
        this.side = side;
    }

    public Square(double width, double height, String color, boolean filled, double side) {
        super(width, height, color, filled);
        this.side = side;
    }




    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "A Square with side = "
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
    @Override
    public void resize(double percent) {


        side += side*percent/100;
    }

}
