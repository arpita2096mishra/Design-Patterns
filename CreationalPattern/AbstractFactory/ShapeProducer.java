public class ShapeProducer {
    public static void main(String[] args) {
        FactoryProducer fp=new FactoryProducer();
        AbstractFactory af1=fp.geFactory("rounded");
        Shape shape1=af1.getShape("rectangle");
        Shape shape2=af1.getShape("square");
        shape1.draw();
        shape2.draw();
        AbstractFactory af2=fp.geFactory(null);
        Shape shape3=af2.getShape("rectangle");
        Shape shape4=af2.getShape("square");
        shape3.draw();
        shape4.draw();

    }
}
