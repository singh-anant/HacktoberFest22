// This program finds median of two sorted array in linear time
class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int n=a.length;
        int m=b.length;
        int k=0;
        
        if((m+n)%2!=0) k=(m+n)/2;
        else k=((m+n)/2)-1;
        
        int a1=0,a2=0,count=0,l=0,r=0;
        
        while(l<n && r<m){
            if(a[l]<=b[r]) {
                if(count==k) a1=a[l];
                if(count==k+1) a2=a[l];
                l++;
            }
            else{
                if(count==k) a1= b[r];
                if(count==k+1) a2=b[r];
                r++;
            }
            count++;
            
        }
        while(l<n){
            if(count==k) a1=a[l];
            if(count==k+1) a2=a[l];
            l++;count++;
        }
        while(r<m){
            if(count==k) a1= b[r];
            if(count==k+1) a2=b[r];
            r++; count++;
        }
        if((m+n)%2!=0) return (double)a1;
        else return (double)((a1+a2)/2.0);        
        
    }
}