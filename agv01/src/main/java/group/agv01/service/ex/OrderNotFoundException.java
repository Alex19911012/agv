package group.agv01.service.ex;

public class OrderNotFoundException extends ServiceException{

	/**
	 * 用户数据不存在
	 */
	private static final long serialVersionUID = 5156778717593377564L;

	public OrderNotFoundException() {
		super();
		
	}

	public OrderNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public OrderNotFoundException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public OrderNotFoundException(String message) {
		super(message);
		
	}

	public OrderNotFoundException(Throwable cause) {
		super(cause);
		
	}
	
}
