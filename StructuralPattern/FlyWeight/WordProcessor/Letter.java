public class Letter implements ILetter {
    private char character;
    private String fontType;
    private int fontSize;
    public Letter(char character,String fontType,int fontSize){
        this.character=character;
        this.fontType=fontType;
        this.fontSize=fontSize;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("row x:"+x+" column y:"+y+"character "+character);
    }
    
}
