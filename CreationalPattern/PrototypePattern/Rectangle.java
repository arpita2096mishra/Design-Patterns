public class Rectangle implements Shape{
    int x;
    int y;

    public Rectangle(int x,int y){
        this.x=x;
        this.y=y;
    }
    
    @Override
    public Shape clone(){
        return new Rectangle(x,y);
    }

    @Override
    public String toString(){
     System.out.println("Details: "+ x +","+y);
     return "success";
    }


}