package javaRestAssuredBasics;

import java.io.File;
import java.io.IOException;
import com.google.gson.*;
import java.io.FileReader;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RequestBodyAsFileInput {

	public static void main(String[] args) throws IOException {

		System.out.println("-------");
//		Using Jackson Library
		System.out.println("Using Jackson Library");
		File file = new File("src/test/resources/jsonFiles/practice_1.json");
		ObjectMapper mapper = new ObjectMapper();
		JsonNode jsonNode = mapper.readTree(file);

		// Print specific values
		System.out.println("ID: " + jsonNode.get("id").asText());
		System.out.println("Name: " + jsonNode.get("name").asText());

		System.out.println("-------");

//		Using Gson Library
		System.out.println("Using Gson Library");
		FileReader reader = new FileReader("src/test/resources/jsonFiles/practice_1.json");
		JsonObject jsonObject = JsonParser.parseReader(reader).getAsJsonObject();

		// Print specific values
		System.out.println("ID: " + jsonObject.get("id").getAsString());
		System.out.println("Name: " + jsonObject.get("name").getAsString());
		System.out.println("-------");

	}

}
