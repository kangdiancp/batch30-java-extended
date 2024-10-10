package day01;

import java.util.ArrayList;
import java.util.List;

public class Problem03 {
    public static void main(String[] args) {

        List<Integer> listNums = findDivisorList(50);
        for (Integer item:listNums){
            System.out.println("item : "+item);
        }

    }

    static List<Integer> findDivisorList(int value){
        final List<Integer> divisiors = new ArrayList<Integer>();

        for (int i = 1; i < value; i++) {
            if (value % i ==0){
                divisiors.add(i);
            }
        }

        return divisiors;
    }
}
