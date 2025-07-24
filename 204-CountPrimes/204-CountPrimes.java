// Last updated: 7/24/2025, 9:25:08 PM
public class Solution {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0; // No primes less than 2
        }
        
        // Array to mark the primality of each number
        boolean[] isPrime = new boolean[n];
        // Initialize all entries as true
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }
        
        // Sieve of Eratosthenes algorithm
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        // Count the number of prime numbers
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        
        return count;
    }
}




/*class Solution {
    public int countPrimes(int n) {

        if(n<2){
            return 0;
        }
        int count=0;
        for(int i=2;i<n;i++){
            int flag=0;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                count++;
            }
        }
        return count;
    }
}
*/