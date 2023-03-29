package com;

import java.util.TreeSet;

public class Main1 {
public static void main(String[] args) {
	Cricket c1=new Cricket("RcB",120);
	Cricket c2=new Cricket("Csk",180);
	Cricket c3=new Cricket("Mi",130);
	TreeSet<Cricket>t=new TreeSet<Cricket>();
	t.add(c1);
	t.add(c2);
	t.add(c3);
	for(Cricket c:t) {
		System.out.println(c);
	}
	}
}
