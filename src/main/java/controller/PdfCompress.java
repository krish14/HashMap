package controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;

public class PdfCompress {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws DocumentException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, DocumentException, IOException {
		// TODO Auto-generated method stub
		
		PdfReader reader = new PdfReader(new FileInputStream("D://SPRING//workspace//HashMap//src//main//resources//files//SharanyaSEM1To7.pdf"));
		PdfStamper stamper = new PdfStamper(reader, new FileOutputStream("\\resources\\files\\output.pdf"));
		int total = reader.getNumberOfPages() + 1;
		for ( int i=1; i<total; i++) {
		   reader.setPageContent(i + 1, reader.getPageContent(i + 1));
		}
		System.out.println("finished...!");
		stamper.setFullCompression();
		stamper.close();

	}

}
