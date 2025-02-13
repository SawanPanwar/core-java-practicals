package com.rays.intfc;

public class TestBusinessman {

	public static void main(String[] args) {

		Businessman b = new Businessman();

		b.earnMoney();

		b.party();

		b.donation();

		b.helpToOthers();

		Richman r = new Businessman();

		r.earnMoney();

		r.party();

		r.donation();

		SocialWorker s = new Businessman();

		s.helpToOthers();
	}
}
