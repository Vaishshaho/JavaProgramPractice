public class ReverseWords {

    public static void main(String[] args){

        String str = "Shaho Vaishnavi Deepak Pawar";
        String [] words = str.split(" ");

        for(String word : words) {
            String reverseWord = "";
            for(int i=word.length()-1;i>=0;i--){
                reverseWord = reverseWord + word.charAt(i);
            }
            System.out.print(reverseWord+ " ");
        }
        }

}
