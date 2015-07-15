package com.andela.spring;

import java.util.UUID;

public class BankAccount {

	private UUID id;

	public void createNewAccount() {
		if (id == null) {
			id = UUID.randomUUID();
		}
		System.out
				.println("New bank account with security key has been created => "
						+ id.toString());
	}

}
