package com.deloitte.testing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class EmailList {
	private static HashSet<String> sites = new HashSet<>();
	private static int maxsize = 0;
	private static ArrayList<EmailList> list;
	private String site;
	private HashSet<String> emails = new HashSet<>();

	private EmailList(String site, String email) {
		this.site = site;
		sites.add(site);
		add(email);
	}

	private void add(String email) {
		emails.add(email);
		if (maxsize < emails.size()) {
			maxsize = emails.size();
		}
	}
	
	/* Email Sorting */
	public static void sortEmails(String[] mails) {
		/* Sorting mails as per Domain */
		list = new ArrayList<>();
		for (int i = 0; i < mails.length; i++) {
			String tmail = mails[i], mailsite = tmail.substring(tmail.lastIndexOf('@') + 1, tmail.lastIndexOf('.'));
			if (!EmailList.sites.contains(mailsite)) {
				EmailList e = new EmailList(mailsite, tmail);
				list.add(e);
			} else {
				for (int j = 0; j < list.size(); j++) {
					if (list.get(j).site.equalsIgnoreCase(mailsite)) {
						list.get(j).add(tmail);
					}
				}
			}
		}
	}
	public static void printList() {
		/* Designing the Printing Format */
		String[][] pf = new String[EmailList.maxsize + 1][EmailList.sites.size()];
		Iterator<EmailList> pfi = list.iterator();
		for (int i = 0; i < EmailList.sites.size() && pfi.hasNext(); i++) {
			EmailList e = pfi.next();
			pf[0][i] = e.site;
			int count = 1;
			Iterator<String> ei = e.emails.iterator();
			while (ei.hasNext()) {
				pf[count++][i] = ei.next();
			}
		}

		for (int i = 0; i < pf.length; i++) {
			for (int j = 0; j < pf[i].length; j++) {
				System.out.printf("%32s", pf[i][j] != null ? pf[i][j] : "");
			}
			System.out.println();
		}
	}
	public static ArrayList<EmailList> getList() {
		return list;
	}

	@Override
	public String toString() {
		return site + " : " + emails;
	}
	
}
