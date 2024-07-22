import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter no. of subjects:");
        int no_of_subjects=sc.nextInt();
        System.out.println("");

        double total_marks=0;
        int marks[]=new int[no_of_subjects];
        
        for (int i = 0; i < no_of_subjects; i++) {
            System.out.print("Enter marks of subject "+(i+1) +":");
            marks[i]=sc.nextInt();
            total_marks += marks[i];
        }
        System.out.println("");

        double average=(double) (total_marks / no_of_subjects);
        char grade;
        
        if(average>90){
            grade='A';}
        else if(average>80){
            grade='B';
        }
        else if(average>70){
            grade='C';
        }
        else if(average>60){
            grade='D';
        }
        else if(average>35){
            grade='P';
        }
        else{
            grade='F';
        }
        
        System.out.println("*******RESULT********");
        System.out.println("");
        System.out.println("Total Marks:"+total_marks);
        System.out.println("Average Percentage:"+average);
        System.out.println("GRADE:"+grade);
    }
}