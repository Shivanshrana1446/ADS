import java.util.*;

public class dup{

    public static String duplictae(String a){
        Map<Character,Boolean>k=new HashMap<>();
        StringBuilder s=new StringBuilder();
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            if(!k.containsKey(ch)){
                k.put(ch,true);
                s.append(ch);
            }




        }
        return s.toString();
        



    }
    public static void main(String[] args){
        String a="abcabcbb";
        String Ke=duplictae(a);
        System.out.println(Ke.length());
        
    }
}