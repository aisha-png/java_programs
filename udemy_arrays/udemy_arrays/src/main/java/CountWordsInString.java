
public class CountWordsInString {
    public static int wordCount(String string){
        int count = 0;

        char ch[] = new char[string.length()];
        for(int i = 0; i < string.length(); i++){
            ch[i] = string.charAt(i);
            if( ((i>0) && (ch[i] != ' ') || ((ch[0] != ' ') && (i==0))) );
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String string = "Somalia is My Country";
        wordCount(wordCount(string) + " words.");
    }

//    NOT PRINTING 4 WORDS  :(


}
