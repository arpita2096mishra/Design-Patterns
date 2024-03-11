public class Student implements Cloneable{
   String name;
   int rollNo;
   int age;

   public Student(String name,int rollNo,int age){
    this.name=name;
    this.rollNo=rollNo;
    this.age=age;
   }

   @Override
   public Object clone() throws CloneNotSupportedException{
    return super.clone();
   }

   @Override
   public String toString(){
    System.out.println("Details: "+ name+","+rollNo+","+age);
    return "success";
   }
}