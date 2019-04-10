package group.agv01.service.ex;

/**
 * 用户名被占用的异常
 * @author soft01
 *
 */
public class TaskIDDuplicateException extends ServiceException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1224474172375139228L;

	public TaskIDDuplicateException() {
		super();
		
	}

	public TaskIDDuplicateException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public TaskIDDuplicateException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public TaskIDDuplicateException(String message) {
		super(message);
		
	}

	public TaskIDDuplicateException(Throwable cause) {
		super(cause);
		
	}
	
}
