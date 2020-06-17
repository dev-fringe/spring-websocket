
package dev.fringe.model;

import lombok.Data;

@Data
public class Response {
	private String result;

	public Response(String result) {
		this.result = result;
	}
}
