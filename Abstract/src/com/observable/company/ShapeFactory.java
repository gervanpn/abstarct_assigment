public class ShapeFactory implements AbstractFactory {
    Shape shape;

    public ShapeFactory(Shape shape) {
        this.shape = shape;
    }

    @Override
    public Shape getShape() {
        System.out.println(this.shape + "has been created.");
    }


}