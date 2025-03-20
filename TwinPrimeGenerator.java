/**
 * Author: Sariah Bjornn
 * Date: 3/17/25
 * Description: Class that finds a pair of twin primes and returns the larger of the two as the size
 * of the 
 */
public class TwinPrimeGenerator {
    public static int GenerateTwinPrime(int min, int max){
        int newSize = min+2;
        boolean foundPrime1 = false;
        boolean foundPrime2 = false;
        while(newSize <= max){
            foundPrime1 = CheckIfPrime(newSize);
            if(foundPrime1) {
                foundPrime2 = CheckIfPrime(newSize-2);
                if(foundPrime2){
                    return newSize;
                }
            } newSize++;
        }
        return -1;
    }

    private static boolean CheckIfPrime(int val) {
        for(int i = 2; i*i < val; i++) {
            if(val % i == 0) {
                return false;
            }
        }
        return true;
    }

    // tester program to see if I get what I want with this
//     public static void main(String[] args){
//         int largerPrime = GenerateTwinPrime(95500, 96000);
//         if(largerPrime <0) {
//             System.out.println("Didn't find the primes correctly.");
//         } else {
//             System.out.println("Twin primes between 95500 and 96000 = " + (largerPrime-2) + ", "+largerPrime);
//         }
//     }
 }


