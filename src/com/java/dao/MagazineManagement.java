package com.java.dao;

import com.java.model.Book;
import com.java.model.Magazine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MagazineManagement {
    Scanner input = new Scanner(System.in);
    ArrayList<Magazine> magazineList = new ArrayList<>();

    public ArrayList<Magazine> getList(){
        return magazineList;
    }

    public void addMagazine(Magazine magazine){
        magazineList.add(magazine);
    }

    public void removeMagazine(Magazine magazine){
        magazineList.remove(magazine);
    }
    public void updateMagazine(Magazine updateMagazine) {
        for (Magazine magazine : magazineList) {
            if(magazine.getID() == updateMagazine.getID()){
                magazine.setIssueNumber(updateMagazine.getIssueNumber());
                magazine.setReleaseMonth(updateMagazine.getReleaseMonth());
                magazine.setProducer(updateMagazine.getProducer());
                magazine.setReleaseNumber(updateMagazine.getReleaseNumber());
            }
            return;
        }
    }

    public Magazine searchByID(int ID){
        for(Magazine magazine : magazineList){
            if(magazine.getID()==ID){
                return magazine;
            }
        }
        return  null;
    }
}
