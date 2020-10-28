/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codegear;

/**
 *
 * @author user
 */
public class population {
    public static void main(String[] args)
    {
    double TotalSec = 60*60*24*365;
    double birthPop =(TotalSec/7) * 5;
    double DeathPop =(TotalSec/13) * 5;
    double immPop = (TotalSec/45) * 5;
    double newPop = 312032486 + birthPop + immPop - DeathPop;
        System.out.println("The total Birth Population in 5rs is "+ birthPop);
        System.out.println("The total Death Population in 5rs is "+ DeathPop);
        System.out.println("The total Immigrant Population in 5rs is "+ immPop);
        System.out.println("The New Population in 5rs is "+ newPop);
    }
    
}
