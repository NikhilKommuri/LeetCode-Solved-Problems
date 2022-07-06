class Solution {
    public int[][] indexPairs(String text, String[] words) {
        List<int []> list = new ArrayList<int []>();
         for (String word : words) {
            int start = 0;
            while (text.indexOf(word, start) >= 0) {
                int l = text.indexOf(word, start);
                list.add(new int[] {l, l + word.length() - 1});
                start = l + 1;
            }
        }
        list.sort((a, b) -> a[0] - b[0] == 0 ? (a[1] - b[1]) : (a[0] - b[0]));
        return list.toArray(new int[0][0]);
    }
}