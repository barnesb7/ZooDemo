package com.company;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<Pen> allZooPens = new ArrayList<>();


    public void addPen(Pen newPen){
        allZooPens.add(newPen);
    }


    public void removePenByName(String penName){
        for(int i = 0; i < allZooPens.size(); i++){
            if(allZooPens.get(i).getPenName().equals(penName)){
                allZooPens.remove(i);
            }

            if(i == allZooPens.size() - 1){
                System.out.println("A pen with the name " + penName + " could not be found." );
            }
        }
    }


    public void showAllPens(){
        System.out.println(allZooPens);
    }

}
