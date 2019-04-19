package group.agv01.service.ex;

/**
 * 用户名被占用的异常
 * @author soft01
 *
 */
public class AGVIDDuplicateException extends ServiceException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1224474172375139228L;

	public AGVIDDuplicateException() {
		super();
		
	}

	public AGVIDDuplicateException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public AGVIDDuplicateException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public AGVIDDuplicateException(String message) {
		super(message);
		
	}

	public AGVIDDuplicateException(Throwable cause) {
		super(cause);
		
	}
	
}
