class Solution {
    public boolean checkValid(int[][] matrix) {
        Set<Integer> rowSet = new HashSet<>();
        Set<Integer> colSet = new HashSet<>();
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] < 1 || matrix[i][j] > n) return false;
                rowSet.add(matrix[i][j]);

                if (matrix[j][i] < 1 || matrix[j][i] > n) return false;
                colSet.add(matrix[j][i]);

            }
            if (rowSet.size() != n) return false;
            if (colSet.size() != n) return false;
            rowSet.clear();
            colSet.clear();
        }
        return true;
    }
}