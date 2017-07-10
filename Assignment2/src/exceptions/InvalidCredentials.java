package exceptions;

public class InvalidCredentials extends RuntimeException {

    public InvalidCredentials(){
        super("User Name or Password does no match any account on file");
    }

}
