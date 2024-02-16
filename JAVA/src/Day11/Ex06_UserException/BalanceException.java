package Day11.Ex06_UserException;



/**
 * 
 * 사용자 정의 예외 클래스
 * -public class ?? Exception ectends Exception {} 
 * 
 */

public class BalanceException extends Exception   {

	public BalanceException(String string) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public BalanceException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public BalanceException(String message, Throwable cause) {
		super(message, cause);
	}

	
	}


