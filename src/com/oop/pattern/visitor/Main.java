package com.oop.pattern.visitor;

import java.util.*;

public class Main {
    public static void main(String[] args) {
    	
        ArrayList<Print> notis = new ArrayList<Print>();
        notis.add(new HTMLData());
        notis.add(new WordData());

        Report rp = new Report();
        rp.generateReport(notis);
    }
}