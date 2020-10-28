/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weathercalc;

/**
 *
 * @author user
 */
public class weatherCalculating {

    public static void main(String[] args) {
        int[] temp = {3, 1, 2, 3, 1};
        int[] rain = {2, 2, 4, 5, 2};
        int[] meanRain = new int[5];
        int[] meanTemp = new int[5];
        int sumtemp = sum(temp);
        int sumRain = sum(rain);
        double meanTemperature = getmean(temp);
        double meanRainfall = getmean(rain);
        double tempMeanDiff = getMeanDiff(temp, meanTemp);
        double rainMeanDiff = getMeanDiff(rain, meanRain);
        
        double RC = getSummationMeanDiff(meanRain, meanTemp);
        double RCCorrect = RC/Math.sqrt(RC);
        System.out.println(RCCorrect);
        
        printArray(temp);

    }

    static int sum(int[] arraySum) {
        int sum = 0;
        for (int i = 0; i < arraySum.length; i++) {
            sum += arraySum[i];
        }
        return sum;
    }

    static double getmean(int[] arrayMean) {
        double mean = sum(arrayMean) / arrayMean.length;
        return mean;
    }

    static double getMeanDiff(int[] arraySummation, int[] arraymeanDiff) {
        double summation = 0;
        double mean = getmean(arraySummation);
        for (int i = 0; i < arraySummation.length; i++) {
            arraymeanDiff[i] = (int)((arraySummation[i] - mean) * (arraySummation[i] - mean));
            summation += (arraySummation[i] - mean) * (arraySummation[i] - mean);
            
        }
        return summation;
    }

    static double getSummationMeanDiff(int[] arraySummationMeanDiff1, int[] arraySummationMeanDiff2) {
        double summationMeanDiff = 0;
        for (int i = 0; i < arraySummationMeanDiff1.length; i++) {
           summationMeanDiff += arraySummationMeanDiff1[i] * arraySummationMeanDiff2[i];
        }
return summationMeanDiff;
    }
    
    static void  printArray(int [] printingArray){
    for (int i=0;i< printingArray.length; i++ ){
        System.out.printf("%d" , printingArray[i]);
    }
    System.out.println();
    }
}
