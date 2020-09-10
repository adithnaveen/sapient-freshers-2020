package com.training.exception;

class NameTooSmallException extends Exception {
	private String msg;

	public NameTooSmallException() {
		this.msg = "Sorry too small name";
	}

	@Override
	public String toString() {
		return "NameTooSmallException [msg=" + msg + "]";
	}

}