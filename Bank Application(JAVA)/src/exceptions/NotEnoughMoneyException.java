package exceptions;

public class NotEnoughMoneyException extends RuntimeException{

	public NotEnoughMoneyException(){
		super("Insuffiecent Funds");
	}
}
