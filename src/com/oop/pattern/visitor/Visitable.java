package com.oop.pattern.visitor;

public interface Visitable {
	public void accept(ReportVisitor v);
}