package group.agv01.base.message;

/**
 * 消息接口
 * @author Alex
 *
 */
public interface Message {
	void decode(byte[] bytes);
    byte[] encode();
    byte getMessageType();
    long getMessageId();

}
