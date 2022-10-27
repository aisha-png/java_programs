package advancedSimpleProgramming1;

public class ToggleWords {
    public static String toggleString(String str){
        String words[] = str.split("\\s");
        String toggle="";
        for(String w: words){
            String first = w.substring(0,1);
            String afterFirst = w.substring(1);
            toggle += first.toLowerCase() + afterFirst.toUpperCase() + " ";
        }
        return toggle.trim();
    }

}
