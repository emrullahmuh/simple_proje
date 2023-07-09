package main;

import java.util.Arrays;
import java.util.List;

public class countTest {
    public static void main(String[] args) {
        List<Integer> ci = Arrays.asList(1, 2, 3, 4);
        int count = countIf(ci, new  oddPredicate());
        System.out.println("Number of odd integers = " + count);
  
  
  
    }

    private static<T> int  countIf(List<T> ci, UnaryPredicate<T> p) {
int count=0;
        for (T t : ci) {
            if (p.test(t)==true){
                ++count;
            }
        }


 return count;   }
}
