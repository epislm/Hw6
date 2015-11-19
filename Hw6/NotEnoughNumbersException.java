public class NotEnoughNumbersException extends IllegalArgumentException {
	public NotEnoughNumbersException(){}
	
	public NotEnoughNumbersException(String message){
		super(message);
	}
}