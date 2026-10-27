class Solution {
    public String[] createGrid(int m, int n) {
        String[] grid = new String[m];

        if (m == 1) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append('.');
            }
            grid[0] = sb.toString();
            return grid;
        }

        if (n == 1) {
            for (int i = 0; i < m; i++) {
                grid[i] = ".";
            }
            return grid;
        }

        for (int i = 0; i < m; i++) {
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < n; j++) {
                if (i == 0 || j == n - 1) {
                    sb.append('.');
                } else {
                    sb.append('#');
                }
            }

            grid[i] = sb.toString();
        }

        return grid;
    }
}