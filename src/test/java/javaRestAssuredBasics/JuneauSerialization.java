package javaRestAssuredBasics;

import org.apache.juneau.json.JsonSerializer;

public class JuneauSerialization {

	public static void main(String[] args) {

		String[] sellerArray = { "Aju", "Banu", "Christie", "Dani", "Eva" };

		BasicPojoClass basicPojoClass = new BasicPojoClass(1000, "iPhone", "Red", sellerArray);

		JsonSerializer serializer = JsonSerializer.DEFAULT_READABLE;
		String jsonString = serializer.serialize(basicPojoClass);
		System.out.println(jsonString);
		
	}

}
