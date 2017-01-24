package com.algaworks.socialbooks.services.exceptions;

public class AutorNaoEncontradoException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public AutorNaoEncontradoException(String message, Throwable cause) {
		super(message, cause);
	}

	public AutorNaoEncontradoException(String message) {
		super(message);
	}


}
