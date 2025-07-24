// Last updated: 7/24/2025, 9:24:27 PM
class Solution {
    public int[] constructRectangle(int area) {
        
        int width=(int) Math.sqrt(area);

        while(area % width!=0){
            width--;
        }

        int length=area/width;

        return new int[] {length,width};
    }
}