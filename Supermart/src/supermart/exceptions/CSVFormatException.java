package supermart.exceptions;

/**
 * @author Zaine **** - 
 * 
 * An exception thrown whenever a CSV file selected to be imported
 * doesn't match the expected format
 */
public class CSVFormatException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public CSVFormatException(String message) {
		super("CSV ERROR: " + message);
	}
	
	public String getMessage() {
		return super.getMessage();
	}
}
