package exceptions;


public class UserNotFoundException extends RuntimeException{
	
	public UserNotFoundException(){
		super("No user exisit");
	}

}
