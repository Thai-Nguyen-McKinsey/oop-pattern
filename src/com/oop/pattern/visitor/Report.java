package com.oop.pattern.visitor;

import java.util.*;

public class Report implements ReportVisitor {
	
	public void generateReport(ArrayList<Print> notifications) {
		for (Print pr : notifications) {
			pr.accept(this);
			
//			if pr.instanceOf HTML OR Word 
//			
//			visitHTML(HTMLData en)
//			visitWord(WordData mpn)
		}
	}

	@Override
	public void visitHTML(HTMLData en) {
		// extract related infomation to conduct CSV file
		System.out.println(en.generateContent());
		System.out.println("-----  Print HTML data");
	}

	@Override
	public void visitWord(WordData mpn) {
		// extract related infomation to conduct CSV file

		System.out.println(mpn.generateContent());
		System.out.println("----- Print Word data");
	}
}