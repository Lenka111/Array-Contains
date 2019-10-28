public class ArrayContains {
    public static void main(String[] args){
        int[] arr = new int[]{2,7};
        System.out.println(no23(arr));
    }

    public static boolean no23(int[] nums) {

        return !(nums[0] == 2 || nums[0] == 3||nums[1] == 2 || nums[1] == 3);
    }
}

