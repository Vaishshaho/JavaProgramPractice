public class StringToggle {
    //ASCII Value of a-z = 97 to 122
    //ASCII Value of A-Z = 65 to 90
    public static void main(String[] args) {
        String str = "VaishnavI";
        //Uppercase to Lowercase
        /* StringBuilder output = new StringBuilder();
       for(int i=0;i<str.length();i++)
       {
           char ch = str.charAt(i);
           //check if the char is uppercase
           if(ch>='A'&&ch<='Z'){
               //convert to lowercase by adding 32
               output.append((char)(ch+32));
           }
           else{
               output.append(ch);
           }
       }
       System.out.println(output);*/
        //Lowercase to Uppercase
       /* StringBuilder output = new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            //check if the char is lowercase
            if(ch>='a'&&ch<='z'){
                //convert to uppercase by subtracting 32
                output.append((char)(ch-32));
            }
            else{
                output.append(ch);
            }
        }
        System.out.println(output);*/

        //Toggle Case
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            //check if the char is uppercase
            if (ch >= 'A' && ch <= 'Z') {
                //convert to lowercase by adding 32
                output.append((char) (ch + 32));
            } else if (ch >= 'a' && ch <= 'z') {
                //convert to uppercase by subtracting 32
                output.append((char) (ch - 32));
            } else {
                output.append(ch);
            }
        }
        System.out.println(output);

    }
}


