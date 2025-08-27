package FunctionalInterface.DataExport;

public interface ReportExporter {
    void export(String data);

    default void exportToJSON(String data) {
        System.out.println("Exporting data to JSON (default): { \"report\": \"" + data + "\" }");
    }
}
