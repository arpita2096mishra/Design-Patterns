import java.util.HashMap;
import java.util.Map;

public class LetterFactory {
    private static Map<Character,Letter> mp=new HashMap<>();

    public Letter createLetter(char charVal,String fontType,int fontSize){
        if(mp.containsKey(charVal)==false){
            mp.put(charVal,new Letter(charVal, fontType, fontSize));
        }
        return mp.get(charVal);
       
    }
}
