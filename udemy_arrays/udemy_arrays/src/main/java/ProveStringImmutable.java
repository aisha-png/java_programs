public class ProveStringImmutable {
    public static void referenceCheck(Object x, Object y){
        if(x == y){
            System.out.println("Both pointing to the same reference");
        } else{
            System.out.println("Both are pointing to different reference");
        }
    }
    public static void main(String[] args){
        String str1 = "Java";
        String str2 = "Java";

        System.out.println("Before modification in str1: ");
        referenceCheck(str1, str2);

        str1 += "ava";
        System.out.println("After modification: ");
        referenceCheck(str1, str2);
    }
}
