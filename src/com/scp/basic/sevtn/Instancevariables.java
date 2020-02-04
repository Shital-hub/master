package com.scp.basic.sevtn;

public class Instancevariables {
	int x;
	double d;
	boolean b;
	String s;
	 public static void main(String[] args) {
		Instancevariables i1=new Instancevariables();
		System.out.println(i1.x);
		System.out.println(i1.d);
		System.out.println(i1.b);
		System.out.println(i1.s);
	}
	@Override
	public String toString() {
		return "\n [x=" + x + ", d=" + d + ", b=" + b + ", s=" + s + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}


