package com.oop.pattern.visitor;

public interface ReportVisitor {
	public void visitHTML(HTMLData n);

	public void visitWord(WordData n);
}