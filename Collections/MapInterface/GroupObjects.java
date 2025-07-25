package Collections.MapInterface;

import java.util.*;
public class GroupObjects {

    public static void main(String[] args) {
        
        List<String[]> entries = Arrays.asList(
            new String[]{"HR", "Alice"},
            new String[]{"IT", "Bob"},
            new String[]{"HR", "Carol"},
            new String[]{"IT", "Charli"}
        );

        convertValueIntoList(entries);
    }

    private static void convertValueIntoList(List<String[]> entries) {
        HashMap<String, List<String>> groupedMap = new HashMap<>();

        for (String[] entry : entries) {
            String department = entry[0];
            String employee = entry[1];

            if (!groupedMap.containsKey(department)) {
                groupedMap.put(department, new ArrayList<>());
            }

            groupedMap.get(department).add(employee);
        }

        for (Map.Entry<String, List<String>> entry : groupedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
