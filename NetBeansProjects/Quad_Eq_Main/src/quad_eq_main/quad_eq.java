/*
 * TO COMPUTE ROOTS OF A QUADRACTIC EQUATION
 */
package quad_eq_main;

/**
 *
 * @MUHAMMAD AMOTULRAHMAN OLUWATOSIN 214888
 */
public class quad_eq {
    int a,b,c;
    //Constructor Class
   public quad_eq(int x,int y, int z){
   a=x;
   b=y;
   c=z;
   }
   //METHOD TO FIND DISCRIMINANT
   public double dis(){
   return (b^2)-(4*a*c);
   }
   //METHOD TO COMPUTES ROOT 1
   public double r1(){
   return (-b +(Math.sqrt(dis())))/(2*a);
   }
   //METHOD TO COMPUTES ROOT2
   public double r2(){
   return (-b - Math.sqrt(dis( )))/(2*a);
  }
 //METHOD TO COMPUTES COMPLEX ROOTS
   public double cr(){
   return (-b/(2*a));
   }
}
