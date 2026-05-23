class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);//array sort based on the first elements of each index
        List<int[]> list = new ArrayList<>();
        list.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            int[] last=list.get(list.size()-1);
            if(intervals[i][0] <= last[1]){//overlapping condition
                last[1]=Math.max(intervals[i][1],last[1]);
            }
            else{
                list.add(intervals[i]);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}