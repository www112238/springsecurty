package test.portal.exception;

/**
 * 描述：
 * <p>
 *
 * @author: jiagoushi
 * @date: 2023/4/11 23:06
 */
public class ServiceException extends RuntimeException {

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}

