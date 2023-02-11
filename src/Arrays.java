import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int start =0;
        int end = arr.length-1;
        while(start<end){
            arr[start] = arr[start]^arr[end];
            arr[end] = arr[start]^arr[end];
            arr[start] = arr[start]^arr[end];
            start ++;
            end --;
        }
        System.out.println(java.util.Arrays.toString(arr));
    }
}
