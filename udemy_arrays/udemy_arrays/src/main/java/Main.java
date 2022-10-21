import java.sql.Array;

public class Main {
    public static void main(String[] args) {

        int[] intArray = new int[7];
        // arrays are not a dynamic data structures as you can not change its size once it has been created
        // so this array can only hold 7 integers at max

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

//        for (int i = 0; i < intArray.length; i++){
//            System.out.println(intArray[i]);
//        }

        String[] stringArray = new String[10];
        stringArray[0] = "boom";
        stringArray[1] = "clap";
        stringArray[2] = "the";
        stringArray[3] = "sound";
        stringArray[4] = "of";
        stringArray[5] = "my";
        stringArray[6] = "heart";
        stringArray[7] = "the";
        stringArray[8] = "beat";
        stringArray[9] = "goes on and on and on and on";

//        for (int i = 0; i < stringArray.length; i++){
//            System.out.println(stringArray[i]);
//        }


    }
}
