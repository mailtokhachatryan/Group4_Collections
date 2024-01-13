public class Test {


    public static void main(String[] args) {

        int[] arr = {1, 5, 5, 1, 3, 4, 4, 9, 9};

        int i = singleNumber(arr);
        System.out.println(i);
    }

    public static int singleNumber(int[] nums) {

        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    break;
                } else if (j == nums.length - 1) {
                    res = nums[i];
                }
            }
        }
        return res;
    }

}
