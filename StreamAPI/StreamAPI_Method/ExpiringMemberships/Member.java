package StreamAPI.StreamAPI_Method.ExpiringMemberships;

import java.time.*;

public class Member {
    String name;
    LocalDate expiryDate;

    public Member(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }
}
