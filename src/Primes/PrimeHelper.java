package Primes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by josiebealle on 09/09/2016.
 */
public class PrimeHelper {

    private List<Integer> primes;
    private int nextPossiblePrime;
    private Set<Integer> factors;

    public PrimeHelper(){
        primes = new ArrayList<>();
        primes.add(2);
        primes.add(3);
        nextPossiblePrime = 5;
        factors = new HashSet<>();
    }

    public void generateNextPrime(){
        boolean foundPrime = false;
        boolean currentNumberIsPrime;
        while (!foundPrime){
            currentNumberIsPrime = true;
            for (int prime : primes){
                if (nextPossiblePrime % prime == 0) { 
                    currentNumberIsPrime = false;
                    break;
                }
            }
            if (currentNumberIsPrime){
                primes.add(nextPossiblePrime);
                foundPrime = true;
            }
            nextPossiblePrime += 2;
        }
    }

    public Integer[] generateFactors(int n){
        generateRecursively(n);
        return factors.toArray(new Integer[factors.size()]);
    }
    public void generateRecursively(int n){
        if (n > 1){
            boolean factorFound = false;
            int i = 0;
            while (!factorFound){
                if (i >= primes.size()){
                    generateNextPrime();
                }
                int prime = primes.get(i);
                if (n % prime == 0){
                    factors.add(prime);
                    generateRecursively(n/prime);
                    factorFound = true;
                }
                i++;
            }

        }
    }
}
