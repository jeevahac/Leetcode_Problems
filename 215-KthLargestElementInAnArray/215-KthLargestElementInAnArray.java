// Last updated: 7/24/2025, 9:25:05 PM
class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> minheap=new PriorityQueue<>();

        for(int num:nums){
            minheap.add(num);
        }

        for(int i=minheap.size();i>k;i--){
            minheap.poll();
        }

        return minheap.peek();
        
    }
}