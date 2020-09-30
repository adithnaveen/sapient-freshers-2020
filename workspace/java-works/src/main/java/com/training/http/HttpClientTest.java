package com.training.http;


import java.net.http.HttpClient;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;



public class HttpClientTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		httpGetRequest();
	}

	private static void httpPostRequest() throws URISyntaxException, IOException, InterruptedException {
		
		HttpClient client = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();

		HttpRequest request = HttpRequest.newBuilder(new URI("https://jsonplaceholder.typicode.com/posts"))
				.version(HttpClient.Version.HTTP_2).POST(BodyPublishers.ofString("{sample:sample}")).build();

		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

		System.out.println("Response Body -> \n" + response.body());
		System.out.println("Status Code -> \n " + response.statusCode());
	}

	private static void httpGetRequest() throws IOException, InterruptedException {
		HttpClient client = HttpClient.newHttpClient();

		HttpRequest request = HttpRequest.newBuilder().version(HttpClient.Version.HTTP_2)
				.uri(URI.create("https://jsonplaceholder.typicode.com/todos/2")).build();
//					.headers("Accept-Encoding", "gzip, deflate").build(); 

		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

		String responseBody = response.body();
		int responseStatusCode = response.statusCode();

		System.out.println(responseBody);
		System.out.println(responseStatusCode);
	}

}
