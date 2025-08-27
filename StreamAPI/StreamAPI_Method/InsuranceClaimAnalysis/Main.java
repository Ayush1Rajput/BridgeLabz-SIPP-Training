package StreamAPI.StreamAPI_Method.InsuranceClaimAnalysis;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
        List<Claim> claims = Arrays.asList(
            new Claim("Health", 12000),
            new Claim("Car", 5000),
            new Claim("Health", 18000),
            new Claim("Travel", 7000),
            new Claim("Car", 9000)
        );

        System.out.println("Average Claim Amount by Type:");
        Map<String, Double> avgClaims = claims.stream()
                .collect(Collectors.groupingBy(c -> c.type, Collectors.averagingDouble(c -> c.amount)));

        avgClaims.forEach((type, avg) -> 
            System.out.println(type + " Claims Average: Rs." + avg));
    }
}
