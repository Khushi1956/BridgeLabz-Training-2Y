interface DataExporter {
    void exportToCSV();
    void exportToPDF();

    default void exportToJSON() {
        System.out.println("Default JSON export added later.");
    }
}

class ReportExporter implements DataExporter {
    public void exportToCSV() { System.out.println("Exporting CSV..."); }
    public void exportToPDF() { System.out.println("Exporting PDF..."); }
}

public class ExportDemo {
    public static void main(String[] args) {
        ReportExporter r = new ReportExporter();
        r.exportToCSV();
        r.exportToJSON(); // new feature without changing class
    }
}
