package dubu.github.com.filecacheutil;

public class FileCacheNotFoundException extends Exception {
    private final String msg;

    public FileCacheNotFoundException(String msg) {
        this.msg = msg;
    }
    @Override
    public String getMessage() {
        return msg;
    }
}