package advancedSimpleProgramming1;

public class RemoveCharacter {
    public static String removeCharAt(String str, int index){
        return str.substring(0, index) + str.substring(index + 1);
    }

    public static void main(String[] args) {
        String str = "Somalia is my country";
        System.out.println(removeCharAt(str,3));
    }


}
