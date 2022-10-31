// ! Problem-Statement - https://leetcode.com/problems/max-consecutive-ones/
class Solution {
    public int findMaxConsecutiveOnes(int[] n) {
        int count=0,dum=0;
        for(int i=0; i<n.length;i++){
            if(n[i]==1) dum++;
            else if(n[i]==0) dum=0;
            if(dum>count) count=dum;
        }
        return count;
    }
    
}