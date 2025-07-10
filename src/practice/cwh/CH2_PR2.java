package practice.cwh;

public class CH2_PR2 {
    public static void main(String[] args){
     char grade = 'B';
     // Encrypt grade by adding 8
     grade = (char) (grade + 8);
        System.out.println(grade);
     // Decrypt grade by removing 8 from encrypted grade
        grade = (char) (grade - 8);
        System.out.println(grade);
    }
}
