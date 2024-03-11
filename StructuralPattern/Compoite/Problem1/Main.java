public class Main{
 public static void main(String[] args) {
     Directory d=new Directory("Design Patterns");
     Directory d1=new Directory("Creational Design Patterns");
     Directory d2=new Directory("Structural Design Patterns");
     Directory d3=new Directory("Behavioral Design Patterns");
     File f=new File("Exceptions");
     File f1=new File("Factory");
     File f2=new File("Composite");
     File f3=new File("Template");
     File f4=new File("Strategy");
     d.add(d1);
     d.add(d2);
     d.add(d3);
     d.add(f);
     d1.add(f1);
     d2.add(f2);
     d3.add(f3);
     d3.add(f4);
     d.printName();

 }
}