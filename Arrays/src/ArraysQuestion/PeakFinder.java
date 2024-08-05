package ArraysQuestion;

import java.util.List;
import java.util.ArrayList;

public class PeakFinder {
	public static List<Integer> findPeaks(int[] nums) {
        List<Integer> peaks = new ArrayList<>();
        int n = nums.length;
        if (n == 1) {
            peaks.add(0);
            return peaks;
        }
        if (nums[0] >= nums[1]) {
            peaks.add(0);
        }
        if (nums[n - 1] >= nums[n - 2]) {
            peaks.add(n - 1);
        }
        for (int i = 1; i < n - 1; i++) {
            if (nums[i] >= nums[i - 1] && nums[i] >= nums[i + 1]) {
                peaks.add(i);
            }
        }

        return peaks;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 4, 2, 7, 6, 9};
        List<Integer> peaks = findPeaks(nums);
        System.out.println(peaks); 
    }
}
