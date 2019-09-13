package utilities;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;




public class RestAssuredListener {
	
	public static RequestSpecification Request;

	public RestAssuredListener() {
		
		RequestSpecBuilder builder = new RequestSpecBuilder();
        builder.setBaseUri("https://jsonplaceholder.typicode.com");
        builder.setContentType(ContentType.JSON);
        //var requestSpec = builder.build();
        RequestSpecification requestSpec = builder.build();
        Request = RestAssured.given().spec(requestSpec);
	}
	
	public static ResponseOptions<Response> GetRequestWithoutPathParam(String url) {
        try {
            return Request.get(new URI(url));
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return null;
    }
	
	 public static void GetRequestWithPathParam(String url, Map<String, String> pathParams) {
	        Request.pathParams(pathParams);
	        try {
	            Request.get(new URI(url));
	        } catch (URISyntaxException e) {
	            e.printStackTrace();
	        }
	    }
}
