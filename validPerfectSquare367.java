class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1) return true;
        int lo=0,hi=num; // 0 to num which can be the 0,1,2,3,4,5,6,......num
        while(lo<=hi){
            int mid=lo+(hi-lo)/2; //this is for the getting high values getting out of bound
            if(mid==num/mid) return true;
            else if(mid<(num)/mid) lo=mid+1;
            else if(mid>(num)/mid) hi=mid-1;
        }
        return false;
    }
}