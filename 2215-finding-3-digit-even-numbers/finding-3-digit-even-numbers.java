class Solution {
    public int[] findEvenNumbers(int[] digits) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ele:digits){
            if(map.containsKey(ele)){
                int freq=map.get(ele);
                map.put(ele,freq+1);
            }
            else map.put(ele,1);
        }
        List<Integer> list=new ArrayList<>();
        for(int i=100;i<1000;i+=2){
            int num=i;
            int a=num%10;num/=10;
            int b=num%10;num/=10;
            int c=num;
            if(map.containsKey(a)){
                int aFreq=map.get(a);
                map.put(a,aFreq-1);
                if(aFreq==1) map.remove(a);
                if(map.containsKey(b)){
                    int bFreq=map.get(b);
                    map.put(b,bFreq-1);
                    if(bFreq==1) map.remove(b);
                    if(map.containsKey(c)){
                        list.add(i);
                    }
                    map.put(b,bFreq);
                }
                map.put(a,aFreq);
            }
        }
        int[] ans=new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}