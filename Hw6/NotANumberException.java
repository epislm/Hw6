public class NotANumberException extends IllegalArgumentException {
	public NotANumberException(){}
	
	public NotANumberException(String message){
		super(message);
	}
}