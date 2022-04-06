package com.winvesti.obmanagement.controller.enums;

public enum UserStatus {
	ACTIVE(1, "ACTIVE"),
	SUSPENDED(2, "SUSPENDED"),
	BLOCKED(3, "BLOCKED");
	
	private Integer code;
	private String description;
	
	private UserStatus(Integer code, String description) {
		this.code = code;
		this.description = description;
	}
	
	public Integer getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}
	
	public static UserStatus toEnum(Integer code) {

		if (code == null) {
			return null;
		}

		for (UserStatus status : UserStatus.values()) {

			if (code.equals(status.getCode())) {
				return status;
			}
		}

		throw new IllegalArgumentException("Status do usuário é inválido!");
	}
	
}
