import java.util.*;
 

class CheckString {

    public static void main(String[] args)
    {
 
        
        Helper h = new Helper();
 
        // Print statement
        System.out.println(h.isStringOnlyAlphabet("pratiksha"));
    }
}
 
class Helper {
 
    public static boolean isStringOnlyAlphabet(String str)
    {
 
       
        if (str == null || str.equals("")) {
 
           
            return false;
        }
 
        
        for (int i = 0; i < str.length(); i++) {
 
            
            char ch = str.charAt(i);
            if ((!(ch >= 'A' && ch <= 'Z'))
                && (!(ch >= 'a' && ch <= 'z'))) {
                return false;
            }
        }
 
        
        return true;
    }
} 
