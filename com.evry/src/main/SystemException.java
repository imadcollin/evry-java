package main;
/**
 * 
 */


public class SystemException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private String context;

	public SystemException(String message) {
		super(message);
	}

	public SystemException(String message, String context) {
		super(message);
		this.context = context;
	}

	public String getContext() {
		return context;
	}

}
