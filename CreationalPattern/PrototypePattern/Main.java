public class Main{
    public static void main(String args[]){
        Student s1=new Student("Ram",1,16);
        Student s2=null;
        try {
           s2=(Student)s1.clone();
        }catch(CloneNotSupportedException cnse) {
            System.out.println("Exception Caught");
        }
        System.out.println(s1);
        System.out.println(s2);
        Rectangle r1=new Rectangle(4,5);
        Rectangle r2= (Rectangle) r1.clone();
        System.out.println(r1);
        System.out.println(r2); 
    }
}