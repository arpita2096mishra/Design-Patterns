public class RoundedShapeFactory implements AbstractFactory {

    @Override
    public Shape getShape(String shape) {
        if(shape=="rectangle"){
            return new RoundedRectangle();
           }else if(shape=="square"){
            return new RoundedSquare();
           }
        return null;
    }
    
}
