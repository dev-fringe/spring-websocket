package dev.fringe.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Add {
	private int one;
	private int two;
	
	private String result;

	public Add(String result) {
		this.result = result;
	}

}
