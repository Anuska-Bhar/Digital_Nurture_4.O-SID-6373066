package factory;

public class PdfDoc implements Document {
    @Override
    public void open() {
        System.out.println("Opening a PDF Document");
    }
}