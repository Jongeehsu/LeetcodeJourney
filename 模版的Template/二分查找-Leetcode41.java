//利用 left <= (记住有等于) right 的情况下，如何利用二分法来做一些事情

public class Solution{


    public int firstMissingPositive(int[] nums){


        int len = nums.length;

        Arrays.sort(nums);


        for(int i=1;i<=len;i++){

            int res = binarySearch(nums,i);
            if(res = -1){
                return i;
            }
        }

        return len +1;
    }


    private int binarySearch(int[] nums,int target){

        int left = 0;
        int right = nums.length -1;


        while(left <= right){
            int mid = (left + right) >>1;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                left = mid+1;
            }else{
                right=mid -1;
            }

        }
        return -1;

    }

}