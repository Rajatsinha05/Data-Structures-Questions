

public class floorceil{
    

    public static void main(String[] args){
int [] arr={3,5,6,7,9,11,13,14};
int x=8;
System.out.println("floor=" + getfloor(arr,x));
System.out.println("ceil=" + getceil(arr,x));

    }

    public static int  getceil(int[] arr, int x) {
        int start=0;
        int end=arr.length-1;
        int ceil=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]<x){
                start=mid+1;
            }
            else {
                ceil=arr[mid];
                end=mid-1;
            }
           

        }
        return ceil;
    }

    public static int getfloor(int[] arr, int x) {
        int start=0;
        int floor=-1;
         int end=arr.length-1;
         while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]<x){
                floor=arr[mid];
                start=mid+1;
            }
            else {
                
                end=mid-1;
            }
          
    }
    return floor;
    
}
}
