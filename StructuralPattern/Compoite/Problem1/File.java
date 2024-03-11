public class File implements FileSystem{
    private String name;
    public File(String fname){
        this.name=fname;
    }
    @Override
    public void printName(){
        System.out.println("The filename is: "+name);
    }
}
