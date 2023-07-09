package main;

import java.util.Arrays;

public class main2 <T>{
    public void main(String[] args) {
        Integer[] a={1,2,3,4,5};
        swap(a,1,3);
    }

    private void swap(Integer[] arr, int a, int b) {
int a1=  arr[a];
int a2=arr[b];
int []arra=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            arra[i]=arr[i];
            if (i==a){
                arra[i]=a2;
          continue;
            }
            if (i==b){
                arra[i]=a1;
           continue;
            }

        }

        System.out.println(Arrays.toString(arra));

    }
}
