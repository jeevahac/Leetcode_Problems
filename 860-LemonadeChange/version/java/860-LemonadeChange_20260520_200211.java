// Last updated: 5/20/2026, 8:02:11 PM
1class Solution {
2    public boolean lemonadeChange(int[] bills) {
3
4        int five=0;
5        int ten=0;
6        int twenty=0;
7
8        for(int bill:bills){
9
10            if(bill==5){
11                five++;
12            }
13            else if(bill==10){
14
15                if(five>0){
16                    five--;
17                    ten++;
18                }
19                else{
20                    return false;
21                }
22            }
23            else{
24
25                if(five>0 && ten>0){
26                    ten--;
27                    five--;
28                    twenty++;
29                }
30                else if(five>=3){
31                    five=five-3;
32                }
33                else{
34                    return false;
35                }
36            }
37        }
38        return true;
39        
40    }
41}