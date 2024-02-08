/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str ="";
        for(int i=0; i<args.length; i++){
            str += args[i] += " ";
        }
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        String finalString = "";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>= 'a' && s.charAt(i)<= 'z' || s.charAt(i)==' '){
                finalString += s.charAt(i);
            }
            else if(s.charAt(i)>= 'A' && s.charAt(i)<= 'Z'){
                finalString += (char) (s.charAt(i)+32);
            }
            else   
                finalString += s.charAt(i);
        }
        return finalString;
    }
}