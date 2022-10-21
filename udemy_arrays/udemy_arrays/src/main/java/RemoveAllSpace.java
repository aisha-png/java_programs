
public class RemoveAllSpace {
    public static void main(String[] args) {

//        1st way
        String str = "Somalia is my country";
        String noSpaceStr = str.replaceAll("\\s", "");
        System.out.println(noSpaceStr);


//        2nd way
        String str2 = "Somali is my language";
        char[] strArray = str2.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str2.length(); i++){
            if((strArray[i] != ' ') && (strArray[i] != '\t')){
                sb.append(strArray[i]);
            }
        }
        String noSpaceStr2 = sb.toString();
        System.out.println(noSpaceStr2);
    }
}
