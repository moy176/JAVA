package com.revature.Bank;

import com.revature.Bank.BankAccount;
import com.revature.Bank.BankUser;
import com.sun.tools.javah.Util;
import exceptions.InvalidCredentials;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import static com.sun.tools.javah.Util.*;

public class Logging {
    private static Scanner scanner = new Scanner(System.in);
    BankAccountHolders bankAccountHolders = new BankAccountHolders();
    List<BankUser> bankUserList = (List<BankUser>) bankAccountHolders.read();
    BankAccount bankacct = new BankAccount();


    private void createNewAccount(){
        System.out.println("Enter first name");
        String firstName = scanner.nextLine();
        System.out.println("Enter last name");
        String lastName = scanner.nextLine();
        System.out.println("User name");
        String userName = scanner.nextLine();
        System.out.println("Password");
        String password = scanner.nextLine();

        System.out.println("Account type");
        String accType = scanner.nextLine();
        System.out.println("Acc number");
        double acc = Double.parseDouble(scanner.nextLine());
        System.out.println("Amount");
        double amount = Double.parseDouble(scanner.nextLine());
        BankUser temp = new BankUser(firstName,lastName,userName,password);
        temp.addAccount(new BankAccount(accType,acc,amount));

    }

    private String userName, passWord;

    public void validate() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome, to a Bank App.");
        System.out.println("If you are a first time user please press 1, otherwise press 2(press 3 to exit)");
        int choice = scan.nextInt();
        switch(choice) {
            case 1:{
                createNewAccount();
                bankAccountHolders.write(this.bankUserList);
                break;
            }
            case 2:{
                System.out.println("Enter user name: ");
                 String userName = scan.next();
                System.out.println("Enter password: ");
                String passWord = scan.next();

                BankUser bu=null;

                    if(Objects.equals(passWord, "admin") && Objects.equals(userName, "admin")){
                        System.out.println("works");
                    bankacct.acctOptions();}
                else {
                    System.out.println("Please try again.");
                }
                break;
            }
            case 3:{
                System.exit(0);
            }

            default: {
                throw new InvalidCredentials();
            }
        }//end of switch statement

    }//end of method


}//end of class

