package com.algaworks.socialbooks.services.exceptions;

public class AutorExistenteException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public AutorExistenteException(String message, Throwable cause) {
		super(message, cause);
	}

	public AutorExistenteException(String message) {
		super(message);
	}


}
