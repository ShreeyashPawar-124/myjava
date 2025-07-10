package FAQ;

public class Reverse_a_String {
    public static void main(String[] args) {

        // using algo

        String str = "SHREE";
//        String rev ="";
//        int len = str.length();
//        for (int i = len-1; i >= 0; i--) {
//            rev=rev + (str.charAt(i));
//        }
//        System.out.println(rev);

        // using String Buffer
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());
    }
}