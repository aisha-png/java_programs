

public class ReverseString {
    public static String reverseWord(String str){
        //        Word Reversal:
        String words[] = str.split("\\s");
        String reverseWord ="";
        for(String w: words){
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            reverseWord+= sb + " ";
        }
        return reverseWord.trim();
    }
}
