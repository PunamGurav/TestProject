package API_PRACTICE_FRAMEWORK.API_FRAMEWORK;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Get {

	@Test
	
	public void testGet() {
		
	io.restassured.response.Response response = RestAssured.get("https://api.chucknorris.io/jokes/random");
		
		System.out.println(response.getBody().asString());
		System.out.println(response.statusCode());
		System.out.println(response.getTime());

	}
		@Test
	public void testGet1() {
		
		io.restassured.response.Response response = RestAssured.get("https://api.chucknorris.io/jokes/categories");
			
			System.out.println(response.getBody().asString());
			System.out.println(response.statusCode());
			System.out.println(response.getTime());

		}




}
