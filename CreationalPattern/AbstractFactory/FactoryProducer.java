public class FactoryProducer {
    public  static AbstractFactory geFactory(String factory){
        if(factory=="rounded"){
            return new RoundedShapeFactory();
        }
        return new ShapeFactory();
    }
}
