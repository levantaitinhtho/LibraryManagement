package com.java.dao;


import com.java.model.Book;
import com.java.model.Newspaper;

import java.util.ArrayList;
import java.util.Scanner;

public class NewspaperManagement {
    Scanner input = new Scanner(System.in);
        ArrayList<Newspaper> newspaperList = new ArrayList<>();

        public ArrayList<Newspaper> getList(){
            return newspaperList;
        }

        public void addNewspaper( Newspaper newspaper){
            newspaperList.add(newspaper);
        }

        public void removeNewspaper( Newspaper newspaper){
            newspaperList.remove(newspaper);
        }

    public void updateNewspaper(Newspaper updateNewspaper) {
        for (Newspaper newspaper : newspaperList) {
            if (newspaper.getID() == updateNewspaper.getID()) {
                newspaper.setReleaseDate(updateNewspaper.getReleaseDate());
                newspaper.setReleaseNumber(updateNewspaper.getReleaseNumber());
                newspaper.setProducer(updateNewspaper.getProducer());
            }
            return;
        }
    }
    public Newspaper searchById(int ID){
        for (Newspaper newspaper : newspaperList) {
            if (newspaper.getID() == ID) {
                return newspaper;
            }
        }
        return null;
    }
}

