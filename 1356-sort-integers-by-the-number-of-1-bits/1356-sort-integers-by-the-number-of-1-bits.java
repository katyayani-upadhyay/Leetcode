class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] nums= new Integer[arr.length];
        for(int i=0;i<arr.length;i++){
            nums[i]=arr[i];
        }
        Arrays.sort(nums,(a,b)->{
            int countA=Integer.bitCount(a);
            int countB=Integer.bitCount(b);

            if(countA!=countB){
                return countA-countB;
            }
            return a-b;
        });
        int[] result= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            result[i]=nums[i];
        }


     return result;   
    }
}