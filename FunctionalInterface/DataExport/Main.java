package FunctionalInterface.DataExport;

public class Main {
	public static void main(String[] args) {
        ReportExporter csv = new CSVExporter();
        csv.export("Sales Report");
        csv.exportToJSON("Sales Report");

        ReportExporter pdf = new PDFExporter();
        pdf.export("Employee Report");
        pdf.exportToJSON("Employee Report");
    }
}
