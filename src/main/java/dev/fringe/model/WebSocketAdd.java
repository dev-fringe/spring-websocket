package dev.fringe.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WebSocketAdd {
	private int one;
	private int two;
	
	private String result;

	public WebSocketAdd(String result) {
		this.result = result;
	}

}
