package Exercise;

public class Flowers {
    public int minDays(int[] bloomDay, int m, int k) {
        if (m * k > bloomDay.length) {
            return -1;
        }
        // 时间最久和最短的花的生长天数,作为二分查找的上下界
        int high = 0;
        int low = Integer.MAX_VALUE;
        for (int i = 0; i < bloomDay.length; i++) {
            high = Math.max(high, bloomDay[i]);
            low = Math.min(low, bloomDay[i]);
        }

        while (low < high) {
           int days = (high - low) / 2 + low;
           if (canMake(bloomDay, days, m, k)) {
               high = days;
           } else {
               low = days + 1;
           }
        }
        return low;

    }
    // 用于计算 bloomDay 中连续长度为 k, 且最大元素值不超过 days 的连续子数组的数量是否超过了 m，即代表这 days 天够不够制作 m 束花
    public boolean canMake(int[] bloomDay, int days, int m, int k) {
        int flowers = 0;
        int bouquets = 0;
        for (int i = 0; i < bloomDay.length && bouquets < m; i++) {
            if (bloomDay[i] <= days) {
                flowers++;
                // 够一束花的量了
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                // 不连续了，重头计算
                flowers = 0;
            }
        }
        // 花束的数量够了
        if (bouquets >= m) {
            return true;
        } else {
            return false;
        }
    }
}
