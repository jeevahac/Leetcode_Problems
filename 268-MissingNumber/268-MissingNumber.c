// Last updated: 7/24/2025, 9:24:55 PM
int missingNumber(int* nums, int numsSize) {

    int exp=numsSize*(numsSize+1)/2;
    int act=0;

    for(int i=0;i<numsSize;i++){
        act+=nums[i];
    }

    return exp-act;

    
    
}