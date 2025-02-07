class TwoSum {
    /*
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.

    Example 1:
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

    Example 2:
    Input: nums = [3,2,4], target = 6
    Output: [1,2]

    Example 3:
    Input: nums = [3,3], target = 6
    Output: [0,1]
     */

    public int[] twoSum(int[] nums, int target) {

        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < nums.length; i++) {

            index1 = i;

            for (int j = i + 1; j < nums.length - 1; j++) {

                index2 = j;

                if (nums[index1] + nums[index2] == target) {

                    break;
                }
            }

            if (nums[index1] + nums[index2] == target) {

                break;
            }

        }

        int[] newArray = new int[2];
        newArray[0] = index1;
        newArray[1] = index2;

        return newArray;
    }
}

