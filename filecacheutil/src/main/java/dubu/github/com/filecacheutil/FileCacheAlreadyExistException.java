package dubu.github.com.filecacheutil;

public class FileCacheAlreadyExistException extends Exception {
    private final String msg;

    public FileCacheAlreadyExistException(String msg) {
        this.msg = msg;
    }
    @Override
    public String getMessage() {
        return msg;
    }
}