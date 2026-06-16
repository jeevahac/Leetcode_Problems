// Last updated: 6/16/2026, 2:26:38 PM
1class Solution {
2    public int countPrimes(int n) {
3
4        if (n <= 2) {
5            return 0;
6        }
7
8        boolean[] prime = new boolean[n];
9
10        // Assume all numbers from 2 to n-1 are prime
11        for (int i = 2; i < n; i++) {
12            prime[i] = true;
13        }
14
15        // Sieve
16        for (int i = 2; i * i < n; i++) {
17            if (prime[i]) {
18
19                for (int j = i * i; j < n; j += i) {
20                    prime[j] = false;
21                }
22            }
23        }
24
25        int count = 0;
26
27        // Count only from 2
28        for (int i = 2; i < n; i++) {
29            if (prime[i]) {
30                count++;
31            }
32        }
33
34        return count;
35    }
36}