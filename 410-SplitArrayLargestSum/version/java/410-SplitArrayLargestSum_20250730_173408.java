// Last updated: 7/30/2025, 5:34:08 PM
// study the strivers book allocation problem, ship problem
class Solution {
     public static int Students_count(int nums[],int m){

        int students=1;
        int book_taken=0;
        for(int i=0;i<nums.length;i++){
            if(book_taken+nums[i]<=m){
                book_taken=book_taken+nums[i];
            }
            else{
                students++;
                book_taken=nums[i];
            }
        }

        return students;

    }
    public int splitArray(int[] nums, int m) {
        if(m>nums.length){
            return -1;
        }
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int num:nums){
            if(num>max){
                max=num;
            }
            sum=sum+num;
        }

        int left=max;
        int right=sum;

        while(left<=right){
            int mid=(left+right)/2;

            int no_of_students=Students_count(nums,mid);
            if(no_of_students<=m){  // within less students can possible by m so decrease the right part
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
}