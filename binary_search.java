import java.util.*;
class Main{  
 public static void main(String args[]){  
    int numArray[] = {5,10,15,20,25,30,35}; 
    System.out.println("The input array: " + Arrays.toString(numArray));
    int key = 20;
    System.out.println("\nKey to be searched=" + key);
    int first = 0;
    int last=numArray.length-1; 
    int mid = (first + last)/2;  
    while( first <= last ){
        if ( numArray[mid] < key ){  
            first = mid + 1;     
        }else if ( numArray[mid] == key ){ 
            System.out.println("Element is found at index: " + mid);  
            break;  
        }else{  
            last = mid - 1;  
        }  
        mid = (first + last)/2;  
   }  
   if ( first > last ){  
      System.out.println("Element is not found!");  
   }       
 }  
}
