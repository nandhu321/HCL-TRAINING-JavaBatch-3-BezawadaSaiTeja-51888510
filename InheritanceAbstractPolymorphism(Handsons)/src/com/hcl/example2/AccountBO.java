package com.hcl.example2;

public class AccountBO {
	public FixedAccount getAccountDetail(String detail) {
		String[] l;
		l = detail.split(",");
		double b = Double.parseDouble(l[1]);
		double c = Double.parseDouble(l[3]);
		int t = Integer.parseInt(l[4]);
		FixedAccount fa = new FixedAccount(l[0], b, l[2], c, t);
		return fa;
	}
}
