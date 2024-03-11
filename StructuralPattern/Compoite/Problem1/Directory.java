import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    private String name;
    private List<FileSystem> fs;
    public Directory(String dname){
        this.name=dname;
        this.fs=new ArrayList<>();
    }
    public void add(FileSystem f){
         fs.add(f);
    }
    @Override
    public void printName() {
        System.out.println("The Directory is: "+name);
        for(FileSystem f:fs){
            f.printName();
        }
    }
    
}
