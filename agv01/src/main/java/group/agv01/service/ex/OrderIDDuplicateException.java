package group.agv01.service.ex;

/**
 * 用户名被占用的异常
 * @author soft01
 *
 */
public class OrderIDDuplicateException extends ServiceException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1224474172375139228L;

	public OrderIDDuplicateException() {
		super();
		
	}

	public OrderIDDuplicateException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public OrderIDDuplicateException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public OrderIDDuplicateException(String message) {
		super(message);
		
	}

	public OrderIDDuplicateException(Throwable cause) {
		super(cause);
		
	}
	
}
