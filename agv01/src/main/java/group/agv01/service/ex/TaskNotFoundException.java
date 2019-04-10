package group.agv01.service.ex;

public class TaskNotFoundException extends ServiceException{

	/**
	 * 用户数据不存在
	 */
	private static final long serialVersionUID = 5156778717593377564L;

	public TaskNotFoundException() {
		super();
		
	}

	public TaskNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public TaskNotFoundException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public TaskNotFoundException(String message) {
		super(message);
		
	}

	public TaskNotFoundException(Throwable cause) {
		super(cause);
		
	}
	
}
