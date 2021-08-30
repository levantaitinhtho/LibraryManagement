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
            if(newspaper.getID()==updateNewspaper.getID()){
                System.out.println("1.Edit ID Of Newspaper");
                System.out.println("2.Edit Producer Of Newspaper");
                System.out.println("3.Edit Release Number Of Newspaper");
                System.out.println("4.Edit Release Date Of Newspaper ");
                System.out.println("Please Select The Information To Be Corrected !!!");
                System.out.println("Choose is: ");
                int choose = Integer.parseInt(input.nextLine());
                switch (choose){
                    case 1:
                        System.out.println("Enter New ID of Newspaper");
                        newspaper.setID(Integer.parseInt(input.nextLine()));
                        System.out.println("Successful Change !!!");
                        System.out.println("-----------------------");
                        break;
                    case 2:
                        System.out.println("Enter New Author of Newspaper");
                        newspaper.setProducer(input.nextLine());
                        System.out.println("Successful Change !!!");
                        System.out.println("-----------------------");
                        break;
                    case 3:
                        System.out.println("Enter New Release Number Of Newspaper ");
                        newspaper.setReleaseNumber(Integer.parseInt(input.nextLine()));
                        System.out.println("Successful Change !!!");
                        System.out.println("-----------------------");
                        break;
                    case 4:
                        System.out.println("Enter New Release Date Of Newspaper");
                        newspaper.setReleaseDate(input.nextLine());
                        break;
                    default:
                        System.out.println("Please Select The Information To Be Corrected !!!");
                }
            }else{
                System.out.println("Not Found Newspaper You Need !!");
            }
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

