public class ColorFactory implements AbstractFactory {

    Color color;

    public ColorFactory(Color color) {
        this.color = color;
    }

    @Override
    public Shape getColor() {
        System.out.println(this.color + "has been created.");
    }


}