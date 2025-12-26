class ContainerMostWater {
    public int maxArea(int[] height) {

        int n = height.length;
        int i = 0, j = n - 1;
        int maxAns = 0;

        while (i < j) {
            int h = Math.min(height[i], height[j]);
            int w = j - i;
            int area = h * w;

            maxAns = Math.max(area, maxAns);

            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return maxAns;
    }
}
