package baitapvenha10.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Bai2HashSet {
    public static void main(String[] args) {
        List<Integer> mangSN = new ArrayList<Integer>();
        mangSN.add(1);
        mangSN.add(1);
        mangSN.add(2);
        mangSN.add(3);
        mangSN.add(4);
        mangSN.add(5);
        Set<Integer> soNguyen = new HashSet<Integer>();
        for(int sn:mangSN){
            soNguyen.add(sn);
        }

    }
}
