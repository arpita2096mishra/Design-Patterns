public class Client {
    public static void main(String[] args) {
        ShapeFactory sf=new ShapeFactory();
        Shape rectangle=sf.getShape("rectangle");
        Shape square=sf.getShape("square");
        Shape circle=sf.getShape("circle");
        rectangle.draw();
        square.draw();
        circle.draw();
    }
}
