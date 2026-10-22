
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int prefix_sum = 0;

        Map<Integer, Integer> freq = new HashMap<>();
        freq.put(0, 1);

        for (int num : nums) {
            prefix_sum += num;

            if (freq.containsKey(prefix_sum - k)) {
                count += freq.get(prefix_sum - k);
            }

            freq.put(prefix_sum, freq.getOrDefault(prefix_sum, 0) + 1);
        }

        return count;
    }
}


