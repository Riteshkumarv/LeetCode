
class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0], fast = nums[0];

        // Phase 1: Detect cycle
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Phase 2: Find the duplicate entry point
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}


/* class Solution {
    public int findDuplicate(int[] nums) {

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int num : nums){
            hm.put(num , hm.getOrDefault(num,0) + 1);
        }

        for(int num : nums){
            if(hm.get(num) > 1) return num;
        }
        return -1;
    }
} */