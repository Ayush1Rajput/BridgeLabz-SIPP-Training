package StreamAPI.ForEachMethod.TransactionLogger;

import java.util.*;
import java.time.*;

public class Main {
    public static void main(String[] args) {
        List<String> transactionIds = Arrays.asList("TXN101", "TXN102", "TXN103");

        System.out.println("Transaction Logs:");
        transactionIds.forEach(id -> 
            System.out.println(LocalDateTime.now() + " - Transaction: " + id)
        );
    }
}
