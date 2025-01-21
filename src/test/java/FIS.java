import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import Files.payLoad;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class FIS {
	@Test
	public void FIS_Test() {
		JsonPath js = new JsonPath(payLoad.FIS_test());
	int no_bpi = js.getInt("bpi.size()");
	
	RestAssured.baseURI="https://api.coindesk.com/";
	String response=given().log().all().header("Content-type","application/json")
			.body(payLoad.FIS_test())
			.when().get("v1/bpi/currentprice.json")
			.then().assertThat().statusCode(403).log().all().extract().response().asString();
		
	System.out.println(response);
	System.out.println("SIZE"+no_bpi);
	
	//To get the ALL BPI 
	String bpi=js.getString("bpi");
	System.out.println(bpi);
	
	//b. The GBP ‘description’ equals ‘British Pound Sterling’.
	String GBP="British Pound Sterling’";
	Response response1 = RestAssured.get("https://api.coindesk.com/v1/bpi/currentprice.json");
	//response.then().body("bpi.GBP",equalTo(GBP));
	response1.then().body("bpi.GBP.description", equalTo("British Pound Sterling"));
		
	}
}
