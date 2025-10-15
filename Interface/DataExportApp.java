package interfacee;

interface DataExporter {
 void exportToCSV(); 
 void exportToPDF();

 default void exportToJSON() {
     System.out.println("Exporting data to JSON using default implementation.");
 }
}

class CSVExporter implements DataExporter {
 @Override
 public void exportToCSV() {
     System.out.println("Data exported to CSV format.");
 }

 @Override
 public void exportToPDF() {
     System.out.println("CSVExporter: PDF export not supported.");
 }
 
}

class PDFExporter implements DataExporter {
 @Override
 public void exportToCSV() {
     System.out.println("PDFExporter: CSV export not supported.");
 }

 @Override
 public void exportToPDF() {
     System.out.println("Data exported to PDF format.");
 }
}

class AdvancedExporter implements DataExporter {
 @Override
 public void exportToCSV() {
     System.out.println("AdvancedExporter: CSV export completed.");
 }

 @Override
 public void exportToPDF() {
     System.out.println("AdvancedExporter: PDF export completed.");
 }

 @Override
 public void exportToJSON() {
     System.out.println("AdvancedExporter: JSON export with custom logic.");
 }
}

public class DataExportApp {
 public static void main(String[] args) {
     DataExporter csv = new CSVExporter();
     DataExporter pdf = new PDFExporter();
     DataExporter advanced = new AdvancedExporter();

     System.out.println("=== CSV Export ===");
     csv.exportToCSV();
     pdf.exportToCSV();
     advanced.exportToCSV();

     System.out.println("\n=== PDF Export ===");
     csv.exportToPDF();
     pdf.exportToPDF();
     advanced.exportToPDF();

     System.out.println("\n=== JSON Export ===");
     csv.exportToJSON();       
     pdf.exportToJSON();       
     advanced.exportToJSON(); 
 }
}
