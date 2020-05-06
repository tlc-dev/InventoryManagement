package com.tristanchester.inventoryManagementTest.util;

public enum MemberShipLevel {

	SILVER(.05), GOLD(.10), DIAMOND(.15), PLATINUM(.20);

	private double discount;

	MemberShipLevel(double discount) {
		this.discount = discount;
	}

	public double getDiscount() {
		return discount;
	}

}
