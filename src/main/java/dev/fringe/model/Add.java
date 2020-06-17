package dev.fringe.model;

import lombok.Data;

@Data
public class Add {
	private int one;
	private int two;
	
	private String result;

	public Add() {
		super();
	}
	
	public Add(String result) {
		this.result = result;
	}

}
