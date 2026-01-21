package model.exception;

public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 3L;

	public DomainException(String msg) {
		super(msg);
	}

}
