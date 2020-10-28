/*
 * 
 */
package maximumwind;

/**
 *
 * @MUHAMMAD AMOTULRAHMAN O. 214888
 */
public class MaximumWind {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arrayWind[][] = {{45, 67, 75, 76, 45}, {60, 69, 59, 40, 47}, {79, 58, 60, 32, 57}, {56, 34, 70, 36, 49}};
//
        int max = getMax(arrayWind);
        for (int i = 0; i < arrayWind.length; i++) {
            for (int j = 0; j < arrayWind[i].length; j++) {
                if (arrayWind[i][j] == max) {
                    int Day = j + 1;
                    String day;
                    switch (Day) {
                        case 1:
                            day = "Monday";
                            break;
                        case 2:
                            day = "Tuesday";
                            break;
                        case 3:
                            day = "Wednesday";
                            break;
                        case 4:
                            day ="Thursday";
                            break;
                        case 5:
                            day ="Friday";
                        default:
                            day ="not found";
                            break;
                    }

                    System.out.println("The maximum number is recorded on " + day +  " in week " + (i + 1) );
                }
            }
        }

    }

    public static int getMax(int array[][]) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

//   
}
