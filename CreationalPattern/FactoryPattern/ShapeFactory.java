public class ShapeFactory {
    public Shape getShape(String shape){
        if(shape=="circle"){
            return new Circle();
        }else if(shape=="square"){
            return new Square();
        }else if(shape=="rectangle"){
            return new Rectangle();
        }
        return null;
    }
    
}