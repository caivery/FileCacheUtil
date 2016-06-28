package dubu.github.com.filecacheutil;

/**
 * Created by teknopc on 27-Jun-16.
 */
public class CustomException extends Exception
{

    private static final long serialVersionUID = 1997753363232807009L;

    public CustomException()
    {
    }

    public CustomException(String message)
    {
        super(message);
    }

    public CustomException(Throwable cause)
    {
        super(cause);
    }

    public CustomException(String message, Throwable cause)
    {
        super(message, cause);
    }


}
