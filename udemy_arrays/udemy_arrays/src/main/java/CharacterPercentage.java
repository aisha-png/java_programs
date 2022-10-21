import java.text.DecimalFormat;

public class CharacterPercentage {

    public static void charPercentage(String input){
        int totalChar = input.length();
        int upperCase = 0;
        int lowerCase = 0;
        int digits = 0;
        int others = 0;

        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if(Character.isUpperCase(ch)){
                upperCase++;
            } else if(Character.isLowerCase(ch)){
                lowerCase++;
            } else if(Character.isDigit(ch)){
                digits++;
            } else {
                others++;
            }
        }

        double upperCaseLetterPercentage = (upperCase*100)/totalChar;
        double lowerCaseLetterPercentage = (lowerCase*100)/totalChar;
        double digitsPercentage = (digits*100)/totalChar;
        double otherCharsPercentage = (others*100)/totalChar;

        DecimalFormat format = new DecimalFormat("##.##");
        System.out.println("In " + input + ":");
        System.out.println("Uppercase letters are " + upperCaseLetterPercentage + "%");
        System.out.println("Lowercase letters are " + lowerCaseLetterPercentage + "%");
        System.out.println("Digits letters are " + digitsPercentage + "%");
        System.out.println("Other letters are " + otherCharsPercentage + "%");
    }

    public static void main(String[] args) {
        charPercentage("Gaming is actually fun 100%!");
    }

}
