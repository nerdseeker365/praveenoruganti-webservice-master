package com.praveen.soap.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

public class JerseyRestClient {

	public static void main(String[] args) {
		Client client = ClientBuilder.newClient();

		String result = client.target("http://localhost:8080/praveenoruganti-jersey-jaxrs/restapi/myresource").request().get(String.class);

		System.out.println(result);
	}
}
