package com.hcl.example8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<TicketBooking> b=new ArrayList<TicketBooking>();
		System.out.println("Enter num of ticket details ");
		int no = Integer.parseInt(br.readLine());
		for (int i = 0; i < no; i++) {
			System.out.println("Enter ticket details");
			String details = br.readLine();
			String [] d = details.split(",");
			b.add(new TicketBooking(d[0], Integer.parseInt(d[1])));
		}

		TicketBooking t = new TicketBooking();
		t.minPrice(b);
	}

}
