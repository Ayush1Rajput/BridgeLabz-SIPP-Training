package StreamAPI.StreamAPI_Method.ExpiringMemberships;

import java.util.*;
import java.util.stream.*;
import java.time.*;

public class Main {
	public static void main(String[] args) {
        List<Member> members = Arrays.asList(
            new Member("Ayush", LocalDate.now().plusDays(10)),
            new Member("Divanshu", LocalDate.now().plusDays(40)),
            new Member("Riya", LocalDate.now().plusDays(25)),
            new Member("Aman", LocalDate.now().plusDays(5))
        );

        LocalDate today = LocalDate.now();
        LocalDate limitDate = today.plusDays(30);

        System.out.println("Members with expiring memberships :");
        members.stream()
               .filter(m -> !m.expiryDate.isAfter(limitDate))
               .forEach(m -> System.out.println(m.name + " - Expiry: " + m.expiryDate));
    }
}
