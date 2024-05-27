public class ShapeFactory implements AbstractFactory{

    @Override
    public Shape getShape(String shape) {
       if(shape=="rectangle"){
        return new Rectangle();
       }else if(shape=="square"){
        return new Square();
       }
       return null;
    }
    
}
