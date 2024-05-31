package org.Manish;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Matrix {


    public static void main(String[] args) {

        List<List<Integer>> arr = new ArrayList<>(){{
            add(new ArrayList<>(){{add(0); add(0); add(0);add(0) ;}});
            add(new ArrayList<>(){{add(0); add(0); add(0);add(0) ;}});
            add(new ArrayList<>(){{add(0); add(0);add(1); add(0);}});
            add(new ArrayList<>(){{add(1); add(0);add(0); add(0);}});
//
        }};
        int k =4 ;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < arr.size(); j++) {
                row.add(0);
            }
            ans.add(row);
        }

        while(k>0){
            for(int i=0;i<arr.size();i++){
                for(int j=0;j<arr.size();j++){
                    if(arr.get(i).get(j)==1){
                        ans.get(i).set(j,1);
                    }
                }
            }
            rotate90(arr);
            k--;
        }
        for (List<Integer> a : ans) {
            a.forEach(s -> System.out.print(s + " "));
            System.out.println();
        }
    }

    public static void rotate90(List<List<Integer>> arr) {


        int n = arr.size();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = arr.get(i).get(j);
                arr.get(i).set(j, arr.get(j).get(i));
                arr.get(j).set(i, temp);
            }
        }
        Collections.reverse(arr);
    }
}
