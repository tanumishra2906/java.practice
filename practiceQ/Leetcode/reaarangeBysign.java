class reaarangeBysign{
    public static int[] rearrangeArray(int[] nums){
        int[] ans=new int[nums.length];
        int positiveIndex=0;
        int negativeIndex=1;

        for(int num:nums){ //used for each loop to iterate through the elements of the nums array
            if(num>0){
                ans[positiveIndex]=num;
                positiveIndex+=2;
            }else{
                ans[negativeIndex]=num;
                negativeIndex+=2;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int[] nums={3,1,-2,-5,2,-4};
        int[] result=rearrangeArray(nums); 

        for(int num:result){
            System.out.print(num+" ");
        }
    }
}