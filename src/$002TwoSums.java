import java.util.HashMap;

public class $002TwoSums {

    public static int[] twoSum(int[] nums, int target) {
        int result [] = new int [2];

        for(int i = 0; i < nums.length -1; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
            return result;
    }

    public static int[] twoSumm(int[] nums, int target) {

        int [] result = new int [2];
        HashMap<Integer,Integer> appear = new HashMap<Integer,Integer>();
        for(int i = 0;  i<nums.length; i++) {
            appear.put(nums[i],i);
        }

        for(int i = 0;i < nums.length;i ++) {
            if(appear.containsKey(target - nums[i])) {
                int j = appear.get(target - nums[i]);
                if(i != j) {
                    result[0] = Math.min(i, j);
                    result[1] = Math.max(i, j);
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int [] array = {2,7,11,15};
        int target = 26;
        int a[] = twoSumm(array,target);

        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
