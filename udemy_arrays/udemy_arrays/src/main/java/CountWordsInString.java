
public class CountWordsInString {
    public static int wordCount(String str){
        int count = 0;

        char ch[] = new char[str.length()];
        for(int i = 0; i < str.length(); i++){
            ch[i] = str.charAt(i);
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
