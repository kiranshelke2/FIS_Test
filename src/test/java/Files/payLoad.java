package Files;

public class payLoad {
	public static String petadd() {
		return "{\r\n"
				+ "  \"id\": 9223372036854775041,\r\n"
				+ "  \"username\": \"kiran51\",\r\n"
				+ "  \"firstName\": \"kiran51\",\r\n"
				+ "  \"lastName\": \"kiran\",\r\n"
				+ "  \"email\": \"kiran@51@gmail.com\",\r\n"
				+ "  \"password\": \"kiran@51\",\r\n"
				+ "  \"phone\": \"11111111111\",\r\n"
				+ "  \"userStatus\": 0\r\n"
				+ "}";
		
	}
	public static String addplace() {
		return "{\r\n"
				+ " \"location\": {\r\n"
				+ " \"lat\": -38.383494,\r\n"
				+ " \"lng\": 33.427362\r\n"
				+ " },\r\n"
				+ " \"accuracy\": 50,\r\n"
				+ " \"name\": \"Frontline house\",\r\n"
				+ " \"phone_number\": \"(+91) 983 893 3937\",\r\n"
				+ " \"address\": \"29, side layout, cohen 09\",\r\n"
				+ " \"types\": [\r\n"
				+ " \"shoe park\",\r\n"
				+ " \"shop\"\r\n"
				+ " ],\r\n"
				+ " \"website\": \"http://google.com\",\r\n"
				+ " \"language\": \"French-IN\"\r\n"
				+ "}";
		
	}


public static String Coursedetails() {
	return "{\r\n"
			+ "\r\n"
			+ "\"dashboard\": {\r\n"
			+ "\r\n"
			+ "\"purchaseAmount\": 910,\r\n"
			+ "\r\n"
			+ "\"website\": \"rahulshettyacademy.com\"\r\n"
			+ "\r\n"
			+ "},\r\n"
			+ "\r\n"
			+ "\"courses\": [\r\n"
			+ "\r\n"
			+ "{\r\n"
			+ "\r\n"
			+ "\"title\": \"Selenium Python\",\r\n"
			+ "\r\n"
			+ "\"price\": 50,\r\n"
			+ "\r\n"
			+ "\"copies\": 6\r\n"
			+ "\r\n"
			+ "},\r\n"
			+ "\r\n"
			+ "{\r\n"
			+ "\r\n"
			+ "\"title\": \"Cypress\",\r\n"
			+ "\r\n"
			+ "\"price\": 40,\r\n"
			+ "\r\n"
			+ "\"copies\": 4\r\n"
			+ "\r\n"
			+ "},\r\n"
			+ "\r\n"
			+ "{\r\n"
			+ "\r\n"
			+ "\"title\": \"RPA\",\r\n"
			+ "\r\n"
			+ "\"price\": 45,\r\n"
			+ "\r\n"
			+ "\"copies\": 10\r\n"
			+ "\r\n"
			+ "}\r\n"
			+ "\r\n"
			+ "]\r\n"
			+ "\r\n"
			+ "}\r\n"
			+ "";
  }

	public static String Addbook(String aisle1, String isbn1) {
		
		String payload="{\r\n"
				+ "    \"name\" : \"Learn Appium Automation with Java\",\r\n"
				+ "    \"isbn\": \""+aisle1+"\",\r\n"
				+ "    \"aisle\" :\""+isbn1+"\",\r\n"
				+ "    \"author\":\"john fo2e\"\r\n"
				+ "}";
		return payload;
		
	}


	public static String Deletebooks(String aisle, String isbn) {
		// TODO Auto-generated method stub
		String payload="{\r\n"
				+ "    \"name\" : \"Learn Appium Automation with Java\",\r\n"
				+ "    \"isbn\": \""+aisle+"\",\r\n"
				+ "    \"aisle\" :\""+isbn+"\",\r\n"
				+ "    \"author\":\"john fo2e\"\r\n"
				+ "}";
		return payload;
	}

	public static String FIS_test() {
		return "{\"time\":{\"updated\":\"Jan 21, 2025 04:04:42 UTC\",\"updatedISO\":\"2025-01-21T04:04:42+00:00\",\"updateduk\":\"Jan 21, 2025 at 04:04 GMT\"},\"disclaimer\":\"This data was produced from the CoinDesk Bitcoin Price Index (USD). Non-USD currency data converted using hourly conversion rate from openexchangerates.org\",\"chartName\":\"Bitcoin\",\"bpi\":{\"USD\":{\"code\":\"USD\",\"symbol\":\"&#36;\",\"rate\":\"102,784.196\",\"description\":\"United States Dollar\",\"rate_float\":102784.1957},\"GBP\":{\"code\":\"GBP\",\"symbol\":\"&pound;\",\"rate\":\"81,978.105\",\"description\":\"British Pound Sterling\",\"rate_float\":81978.1049},\"EUR\":{\"code\":\"EUR\",\"symbol\":\"&euro;\",\"rate\":\"98,851.056\",\"description\":\"Euro\",\"rate_float\":98851.0557}}}";
	  }
	
}
