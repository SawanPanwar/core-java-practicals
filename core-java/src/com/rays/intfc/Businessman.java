package com.rays.intfc;

public class Businessman implements Richman, SocialWorker {

	@Override
	public void earnMoney() {
		System.out.println("earn money");
	}

	@Override
	public void party() {
		System.out.println("party");
	}

	@Override
	public void donation() {
		System.out.println("donation");
	}

	@Override
	public void helpToOthers() {
		System.out.println("help to others");
	}

}
