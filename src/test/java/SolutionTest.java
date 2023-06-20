import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void getAveragesTest1() {
        int[] nums = {7, 4, 3, 9, 1, 8, 5, 2, 6};
        int k = 3;
        int[] output = {-1, -1, -1, 5, 4, 4, -1, -1, -1};
        Assert.assertArrayEquals(output, new Solution().getAverages(nums, k));
    }

    @Test
    public void getAveragesTest2() {
        int[] nums = {100_000};
        int k = 0;
        int[] output = {100_000};
        Assert.assertArrayEquals(output, new Solution().getAverages(nums, k));
    }

    @Test
    public void getAveragesTest3() {
        int[] nums = {8};
        int k = 100_000;
        int[] output = {-1};
        Assert.assertArrayEquals(output, new Solution().getAverages(nums, k));
    }
}
