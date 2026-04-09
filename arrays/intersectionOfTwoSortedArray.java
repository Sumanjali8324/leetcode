class Solution {
    ArrayList<Integer> intersection(int[] a, int[] b) {
        // code here
            ArrayList<Integer> r=new ArrayList<>();
            HashSet<Integer> set1=new HashSet<>();
            
            for(int i=0;i<a.length;i++){
                set1.add(a[i]);
            }
            for(int i=0;i<b.length;i++){
                if(set1.contains(b[i])){
                    r.add(b[i]);
                    set1.remove(b[i]);
                }
            }return r;
            
    }
}