public class Rectangle extends Shape implements  Resizeable{
    private double width = 1.0;
    private double height = 1.0;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return height * width;

    }

    public double getPerimter() {
        return (height + width) * 2;
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getHeight()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {

        height += height*percent/100;
        width+= width*percent/100;
    }
}
