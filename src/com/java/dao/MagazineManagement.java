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
                System.out.println("1.Edit ID Of Magazine");
                System.out.println("2.Edit Producer Of Magazine ");
                System.out.println("3.Edit Release Number Of Magazine");
                System.out.println("4.Edit Release Month Of Magazine");
                System.out.println("5.Edit Issue Number Of Magazine");
                System.out.println("Please Select The Information To Be Corrected !!!");
                System.out.println("Choose is: ");
                int choose = Integer.parseInt(input.nextLine());
                switch (choose){
                    case 1:
                        System.out.print("Enter New ID Of Magazine: ");
                        magazine.setID(Integer.parseInt(input.nextLine()));
                        System.out.println("Successful Change !!!");
                        System.out.println("-----------------------");
                        break;
                    case 2:
                        System.out.println("Enter New Producer Of Magazine");
                        magazine.setProducer(input.nextLine());
                        System.out.println("Successful Change !!!");
                        System.out.println("-----------------------");
                        break;
                    case 3:
                        System.out.println("Enter New Release Number Of Magazine");
                        magazine.setReleaseNumber(Integer.parseInt(input.nextLine()));
                        System.out.println("Successful Change !!!");
                        System.out.println("-----------------------");
                        break;
                    case 4:
                        System.out.println("Enter New Release Month Of Magazine");
                        magazine.setReleaseMonth(input.nextLine());
                        System.out.println("-----------------------");
                        break;
                    case 5:
                        System.out.println("Enter New Issue Number Of Magazine");
                        magazine.setIssueNumber(Integer.parseInt(input.nextLine()));
                        System.out.println("-----------------------");
                        break;
                    default:
                        System.err.println("Please Select The Information To Be Corrected !!!");
                }
            } else{
                System.out.println("Not Found");
            }
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
