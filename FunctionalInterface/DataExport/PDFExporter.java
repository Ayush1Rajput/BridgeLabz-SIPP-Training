package FunctionalInterface.DataExport;

public class PDFExporter implements ReportExporter {
    public void export(String data) {
        System.out.println("Exporting data to PDF: " + data + ".pdf file created.");
    }
}