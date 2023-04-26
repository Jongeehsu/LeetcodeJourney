class Solution {
    public void sortColors(int[] nums) {

        int lef = 0;
        int rig = nums.length-1;
        int index = 0;

        while(index<=rig){

            int cur = nums[index];

            if(cur==0){

               int tem = nums[index];
               nums[index] = nums[lef];
               nums[lef] = tem;     

               index++;
               lef++;
            }else if(cur == 1){
                index++;
            }else if(cur == 2){

                int tem = nums[index];
                nums[index] = nums[rig];
                nums[rig] = tem;

                rig--;
            }

        }

        
    }
}


// 刷题问题解决
class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int p0 = 0, p2 = n - 1;
        for (int i = 0; i <= p2; ++i) {
            while (i <= p2 && nums[i] == 2) {
                int temp = nums[i];
                nums[i] = nums[p2];
                nums[p2] = temp;
                --p2;
            }
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[p0];
                nums[p0] = temp;
                ++p0;
            }
        }
    }
}