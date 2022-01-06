package API_PRACTICE_FRAMEWORK.API_FRAMEWORK;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class ApiMethods {

	@Test
	
	public void testGet() 
	{
		given().
		get("http://dummy.restapiexample.com/api/v1/employees").
		then().
		statusCode(200).
		log().all();
		
	}
	@Test
	
	public void TestPost()
	{
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("employee_name","Punam");
		map.put("job","Tester");
		System.out.println(map);
		
		JSONObject jobject = new JSONObject();
		
		jobject.put("employee_name","Seema");
		jobject.put("job","Tester");
		System.out.println(jobject.toString());
	
		baseURI = "https://reqres.in/api";

		given().
		header("content-type","application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(jobject.toJSONString()).
		when().
		post("/users").
		then().
		statusCode(201).log().all();
			
	}
	@Test
	public void testPut() {

		JSONObject request = new JSONObject();

		request.put("employee_name", "Jyoti");
		request.put("job", "Tester");
		System.out.println(request.toJSONString());

		baseURI = "https://reqres.in/api";

		given().
		header("content-type","application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).
		when().
		put("/users/2").
		then().
		statusCode(200).log().all();
		}	
	@Test
	public void testPatch() {

	JSONObject request = new JSONObject();

	request.put("employee_name", "Jyoti");
	request.put("job", "Tester");
	System.out.println(request.toJSONString());

	baseURI = "https://reqres.in";

	given().
	header("content-type","application/json").
	contentType(ContentType.JSON).
	accept(ContentType.JSON).
	body(request.toJSONString()).
	when().
	patch("/api/users?page=2").
	then().
	statusCode(200).log().all();
}
	@Test
	public void testDelete() {

	
	baseURI = "https://reqres.in";

	given().
	when().
	delete("/api/users/2").
	then().
	statusCode(204).log().all();
	
}
	


}
