package factory;

import java.util.*;
public class TestFactory {
    public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in);
    	System.out.println("1. Word Doc\n2. Pdf Doc\n3. Excel Doc");
    	System.out.print("Enter your choice: ");
    	int ch=sc.nextInt();
    	switch(ch)
    	{
    	case 1:
        DocFactory wordFactory = new WordDocFactory();
        Document word = wordFactory.createDocument();
        word.open();
        break;

    	case 2:
        DocFactory pdfFactory = new PdfDocFactory();
        Document pdf = pdfFactory.createDocument();
        pdf.open();
        break;

    	case 3:
        DocFactory excelFactory = new ExcelDocFactory();
        Document excel = excelFactory.createDocument();
        excel.open();
        break;
        
        default:
        System.out.println("Invalid choice!");
    	}
    }
}