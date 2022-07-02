package HomeWorcks.home8.HomeWorck8ExtraMile;

public class ExtraMile {
    public static void main(String[] args) {
        int[] nums = {8, 7, 2, 5, 3, 1};
        int target = 10;
        findPair(nums, target);
        findTriplets(nums, target);

    }


    public static void findPair(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] + nums[i] == target) {
                    System.out.println((nums[j] + "," + nums[i]));
                }

            }
        }
    }

    public static void findTriplets(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int x = j + 1; x < nums.length; x++)
                if (nums[j] + nums[i] + nums[x] == target) {
                    System.out.println((nums[j] + "," + nums[i] + "," + nums[x]));
                }
            }
        }
    }
}