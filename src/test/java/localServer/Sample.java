package localServer;

import com.github.javafaker.Faker;

public class Sample {

	public static void main(String[] args) {
			
		Faker faker = new Faker();

		System.out.println(faker.idNumber().hashCode());
	}

}
