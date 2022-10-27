package advancedSimpleProgramming1;

public class StringRotation {

    public static boolean checkRotation(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        String str3 = str1 + str1;
        if(str3.contains(str2)){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s1 = "avajava";
        String s2 = "javaava";
        System.out.println("Checking is a string is a rotation of another");
        if(checkRotation(s1, s2)){
            System.out.println("Yes " + s2 + " is rotation of " + s1);
        } else {
            System.out.println("No " + s2 + " is not rotation of " + s1);
        }
    }

}
