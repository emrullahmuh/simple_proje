package main;

import java.util.Arrays;

public class main3 {
    public static void main(String[] args) {
        Integer[]a={1,2,3,4,5};
        swap(a,3,2);

        System.out.println(Arrays.toString(a)); }

    private static<T> void swap(T[] arr,int i,int j) {
      T temo=arr[i];
      arr[i]=arr[j];
      arr[i]=temo;
    }
}
