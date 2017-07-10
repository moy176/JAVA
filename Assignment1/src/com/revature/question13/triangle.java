package com.revature.question13;

public class triangle {
	
	public static void main(String[] args){displayTriangle();}
    private static void displayTriangle(){
    	
        for(int i = 0; i < 6; i++){
            for(int j = 0;j<=i; j++ ){
                if(i == 0)
                    System.out.print("0\t");
                else if(i ==1 || i == 2){
                    if(j%2 == 0)
                        System.out.print("1\t");
                    else
                        System.out.print("0\t");
                }
                else if(i == 3){
                    if(j%2 == 0)
                        System.out.print("0\t");
                    else
                        System.out.print("1\t");

                }
            }
            System.out.println();

        }
    }
}

