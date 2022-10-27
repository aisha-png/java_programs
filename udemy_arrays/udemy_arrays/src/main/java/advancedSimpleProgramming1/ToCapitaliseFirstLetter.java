package advancedSimpleProgramming1;

public class ToCapitaliseFirstLetter {
    public static String capitaliseWords(String str){
        String words[] = str.split("\\s");
        String capitalise="";
        for(String w: words){
            String first = w.substring(0,1);
            String afterFirst = w.substring(1);
            capitalise += first.toUpperCase()+afterFirst + " ";
        }
        return capitalise.trim();
    }
}
