/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
          String str ="";
        for(int i=0; i<args.length; i++){
            str += args[i] += " ";
        }
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     * 
     * abccde
     * banned chars = a
     * finalString = a
     */
    public static String uniqueChars(String s) {
        String bannedChars = "" + s.charAt(0);
        String finalString = "" + s.charAt(0);

        for(int i=1; i<s.length(); i++){
            char check = s.charAt(i);
            if (check == ' ')
                finalString += check;
            else{
                Boolean banned = false;
                for(int j=0; j<bannedChars.length() && !banned; j++){
                    if(bannedChars.charAt(j)==check){
                        banned = true;
                    }
                }
                if (banned == false){
                    finalString += check;
                    bannedChars += check;
                }
            }
        }
        return finalString;
    }
}