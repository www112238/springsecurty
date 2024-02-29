package test.portal.exception;

/**
 * @author jiagoushi on 2023/9/13.
 */
public class UsernameIsExitedException extends ServiceException {

    public UsernameIsExitedException(String msg) {
        super(msg);
    }

    public UsernameIsExitedException(String msg, Throwable t) {
        super(msg, t);
    }
}