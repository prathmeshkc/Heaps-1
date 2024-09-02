// Time Complexity : O(nlogk) where n = len of array
// Space Complexity : O(k)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

/**
 * Using a min heap to store only k elements. Since we're using min heap, at the end we'll have
 * k largest elements and the top element will be the kth largest
 */


public class Problem1 {
    private Queue<Integer> pq;
    public int findKthLargest(int[] nums, int k) {
        this.pq = new PriorityQueue<>();
        for(int num: nums) {
            pq.add(num);
            while(pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }
}
