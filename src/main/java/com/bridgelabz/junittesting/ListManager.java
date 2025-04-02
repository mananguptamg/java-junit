package com.bridgelabz.junittesting;

import java.util.List;

public class ListManager {
    public boolean addElement(List<Integer> list, int element){
        return list.add(element);
    }

    public int removeElement(List<Integer> list, int index){
        if(!list.isEmpty()){
            return list.remove(index);
        }
        else{
            return -1;
        }
    }

    public int getSize(List<Integer> list){
        return list.size();
    }
}
