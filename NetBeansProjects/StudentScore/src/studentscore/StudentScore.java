/*
 *TO COMPUTE SUM AND AVERAGE OF STUDENT SCORE PER COURSE 
 */
package studentscore;

/**
 *
 * @MUHAMMAD AMOTULRAHMAN 0. 214888 
 */
import java.util.Scanner;
public class StudentScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     float score[][];
     System.out.println("Enter number of rows and column");
     int r = input.nextInt();
     int c = input.nextInt();
     score = new float[r][c];
//COLLECTING DATA INTO ARRAY
float sum = 0;
      for (int i=0; i<r; i++){
         for (int j=0; j<c; j++){
             System.out.println("Enter score at row "+ (i+1)+ " and column "+ (j+1));
             float a = input.nextFloat();
             score[i][j]= a;
             sum+=score[i][j];// SUMMING THE SCORE
         }
      }
      float avr = sum/(r*c);//AVERAGING THE SCORE
        System.out.println("The Average Score is "+ avr);
//SUMMING SCORES FOR EACH STUDENT;
       for(int i=0; i<r;i++){
           float sumStu = 0;
           for (int j=0; j<c; j++){
           sumStu+= score[i][j];
           }
           float avr2 = sumStu/c;
           System.out.println("The Average Score of Student is " + avr2);
       }
//SUMMING SCORES FOR EACH COURSES
     float sumCor = 0;
   for (int i=0; i<c; i++){
       for ( int j=0; j<r;j++){
     sumCor+=score[j][i];}
     float avrCor = sumCor/c;
     System.out.println("The Average of Course "+ (i+1)+" is "+ avrCor);
   }
   
        
    }
    
}
