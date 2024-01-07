package ec.edu.espe.correccionloachamin.correccion.service.Exceptions;

public class CreateException extends RuntimeException{
    public CreateException(String message){
        super(message);
    }
    public CreateException(String message, Exception cause){
        super(message, cause);
    }

}
