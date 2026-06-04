import java.util.*;

class Solution11 {

    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequencies
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println("Frequency Map: " + map);

        // Max Heap based on frequency
        PriorityQueue<Integer> pq =
                new PriorityQueue<>(
                        (a, b) -> map.get(b) - map.get(a)
                );

        pq.addAll(map.keySet());

        System.out.println("Priority Queue: " + pq);

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = pq.poll();
        }

        return result;
    }
}

public class Lc347{

    public static void main(String[] args) {

        int[] nums = {1, 2, 1, 2, 1, 2, 3, 1, 3, 2};
        int k = 2;

        Solution11 solution = new Solution11();

        int[] result = solution.topKFrequent(nums, k);

        System.out.println("Result: " + Arrays.toString(result));
    }
}