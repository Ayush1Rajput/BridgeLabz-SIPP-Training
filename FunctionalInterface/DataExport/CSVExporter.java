package FunctionalInterface.DataExport;

public class CSVExporter implements ReportExporter {
    public void export(String data) {
        System.out.println("Exporting data to CSV: " + data + ".csv file created.");
    }
}