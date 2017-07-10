package com.revature.question18;

import static java.lang.String.*;

//class is made abstract
public abstract class ParentClass {

	protected int stringToInteger(int input) {
		return 0;
	}
	protected boolean isAnyUpperCase(String input) {
		return false;
	}
	protected String lowerToUpperCase(String input) {
		return null;
	}

}//End of Parent Class

class ChildClass extends  ParentClass{

    @Override
    protected boolean isAnyUpperCase(String input) {
       for(int i =  0; i < input.length(); i++){
           return Character.isUpperCase(input.charAt(i));
       }
        return false;
    }

    @Override
    protected String lowerToUpperCase(String input) {
        return input.toUpperCase();
    }

    @Override
    protected int stringToInteger(int input) {
        return Integer.parseInt(valueOf(input));
    }
    public static void main(String[] args){
    	ParentClass parent = new ChildClass();
    	System.out.println(parent.isAnyUpperCase("KEMOYE"));
    	System.out.println(parent.lowerToUpperCase("What is you dream Job?"));
    	System.out.println(parent.stringToInteger(parent.stringToInteger(Integer.parseInt("154235486"))));
    		
    }//end of main
}