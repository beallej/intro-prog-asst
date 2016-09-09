package Primes;


/**
 * Created by josiebealle on 09/09/2016.
 */
public class Primes {



    public static Integer[] generate(int n){
        PrimeHelper primeHelper = new PrimeHelper();
        return primeHelper.generateFactors(n);

    }


    public static void main(String[] args){

        Integer[] factors =  generate(168);
        for (int factor : factors){
            System.out.println(factor);
        }


    }

}


