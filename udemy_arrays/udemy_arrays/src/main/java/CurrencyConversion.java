import java.util.Arrays;

public class CurrencyConversion {
    double conversionRate = 1.5;
    static int [] num = {1,2,3,4,5};
    static String[] words = {"My","name","is","Aisha"};
    static double[] decimals = {1.2, 2.3,3.4,4.5,5.6};

    static int getArea(int length, int height){
        return length*height;
    }

    static int getAreaOfCircle(int radius){
        return radius*radius;
    }
    static double convertToEuros(int pound, double rate){
        return pound*rate;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(decimals));
        System.out.println(getArea(2,4));
        System.out.println(convertToEuros(10, 1.5));

        for (int i = 0; i <= words.length; i++){
            System.out.println(i);
        }
    }

}
