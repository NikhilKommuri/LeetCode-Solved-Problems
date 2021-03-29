class Solution {
    public String[] reorderLogFiles(String[] logs) {
        List<String> letterLogs = new ArrayList<>();
        List<String> digitLogs = new ArrayList<>();
        for (int i = 0; i < logs.length; i++) {
            int idx = logs[i].indexOf(" ");
            if (Character.isDigit(logs[i].charAt(idx + 1))) {
                digitLogs.add(logs[i]);
            } else {
                letterLogs.add(logs[i]);
            }
        }
        Comparator<String> myComp = new Comparator<String>(){
            @Override
            public int compare(String s1, String s2) {
                int a = s1.indexOf(" ");
                int b = s2.indexOf(" ");
                String temp1 = s1.substring(0, a);
                String temp2 = s2.substring(0, b);

                String toSort1 = s1.substring(a+1);
                String toSort2 = s2.substring(b+1);
                return toSort1.equals(toSort2) ? temp1.compareTo(temp2) : toSort1.compareTo(toSort2);
            }
        };
        Collections.sort(letterLogs,myComp);
        int i = 0;
        for(String s : letterLogs) logs[i++] = s;
        for(String s : digitLogs) logs[i++] = s;
        return logs;
}
    
}
