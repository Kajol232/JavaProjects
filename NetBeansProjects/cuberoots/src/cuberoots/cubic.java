/*
 * 
 */
package cuberoots;

/**
 *
 * @
 */
public class cubic {
    private int num;
    
    public cubic(int n){
    num =n;
    }
public static double getSquare(int n){
double sqr = n*n;
return sqr;
}
public static double getSquareRoot(int n){
double sqrroot =Math.sqrt(n);
return sqrroot;
}
public static double getCube(int n){
    double cube = n*n*n;
    return cube;
}
public static double getCubeRoot(int n){
double cuberoot = Math.cbrt(n);
return cuberoot;
}
    
}
