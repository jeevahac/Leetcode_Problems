// Last updated: 7/28/2025, 6:48:24 PM
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){

            if(i>0 && nums[i]==nums[i-1]){  //0th index number and 1st index number are same means, increase the i value, beacuse  we dont want the duplicate, though the array is sorted
                continue;
            }
            int j=i+1;
            int k=nums.length-1;

            while(j<k){

                int sum=nums[i]+nums[j]+nums[k];

                if(sum<0){
                    j++;
                }
                else if(sum>0){
                    k--;
                }
                else{
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;

                    while(nums[j]==nums[j-1]  && j<k)  j++;

                    while(nums[k]==nums[k+1]  && j<k)  k--;
                }
            }

        }

        return res;
        
    }
}