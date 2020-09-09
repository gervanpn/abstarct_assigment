public class ColorFactory implements AbstractFactory {
    Shape shape;

    public ShapeFactory(Shape sahpe) {
        this.shape = shape;
    }

    @Override
    public Shape getShape() {
        System.out.println(this.shape + "has been created.");
    }


}