package excecoes.fixacao01.model.exception;

public class BusinessException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public BusinessException(String msg) {
        super(msg);
    }
}