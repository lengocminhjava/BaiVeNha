package baitapvenha10.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bai3HashMap {
    public static void main(String[] args) {
        String chuoi = "abcdedjsjsjuwuuwasskskiwiskss";
        Map<Character,Integer> demChuoi = new HashMap<Character,Integer>();
        List<Character> words = new ArrayList<>();
      for(int i =0;i<chuoi.length();i++){
          words.add(chuoi.charAt(i));
      }
        for(char word:words){
           int count = (demChuoi.get(word)==null)?1:(demChuoi.get(word));
          if(demChuoi.containsKey(word)){
              count++;
          }
            demChuoi.put(word,count);
      }

        System.out.println(demChuoi);
    }
}
