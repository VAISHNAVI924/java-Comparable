package com;

public class Cricket implements Comparable<Cricket> {
	String teamname;
	int score;
	Cricket(String teamname,int score){
		this.teamname=teamname;
		this.score=score;
	}
	public String toString() {
		return "the Score of"+teamname+"is"+score;
	}
public  int compareTo(Cricket c) {
	return this.teamname.compareTo(c.teamname);
			
}
}
