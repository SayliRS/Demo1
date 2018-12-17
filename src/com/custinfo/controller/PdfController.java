package com.custinfo.controller;



import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.itextpdf.text.Anchor;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.Barcode128;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;


@CrossOrigin(origins = "*", maxAge = 3600 ,
methods={RequestMethod.GET ,RequestMethod.PUT,RequestMethod.POST ,RequestMethod.DELETE},allowedHeaders="Content-Type")
@RestController
@RequestMapping("/")
public class PdfController {
	
	private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18,
		      Font.BOLD);
		  private static Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,
		      Font.NORMAL, BaseColor.RED);
		  private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,
		      Font.BOLD);
		  private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12,
		      Font.BOLD);
	
		  
	@RequestMapping(value = "/pdfstr")
	public String pdfstr() {
		return "hiii";
	}
	
	 public static String DEST ="";

	 @RequestMapping(value = "/createPdfQ")
	    public void createPdf(HttpServletRequest request) throws IOException, DocumentException {
		
		 	  File dir = new File(request.getServletContext().getRealPath("")+ File.separator + "pdfFiles");
			  dir.mkdirs();
			  DEST = dir.getAbsolutePath()+File.separator+"SmlTable.pdf";
		      File file = new File(DEST);
		      file.createNewFile();
		 
		  	  String FILE = file.getAbsolutePath();
		  	
		  	  Document document = new Document();
		      PdfWriter.getInstance(document, new FileOutputStream(FILE));
		      PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(FILE));
		      Paragraph preface = new Paragraph();
		      
		      // Add header footer
		      HeaderFooter event = new HeaderFooter();
		      writer.setPageEvent(event);
		      document.setMargins(45, 45, 70, 50);
		      
		      //Open pdf
		      document.open();
		      
			      for(int i=0; i<7; i++){
			    	  preface.add(new Paragraph("Title of the document", catFont));
					   
				      document.add(preface);
			      }
		      
		      //-------------------------------------------------------------------------------
		      
		     
			    BaseFont base = BaseFont.createFont("C:/Windows/Fonts/Arial.ttf", BaseFont.WINANSI, false);
				Font qTitle = new Font(base, 14, Font.BOLD);
				
				Font F10BoldB = new Font(base, 10, Font.BOLD);
				Font F12BoldR = new Font(base, 12, Font.BOLD, BaseColor.RED);
				Font F10BoldR = new Font(base, 10, Font.BOLD, BaseColor.RED);
				Font F10B = new Font(base, 10, Font.NORMAL);
				
				//////////////////////////////////////////Main Table 1//////////////////////////////////////////////
			    PdfPTable table1 = new PdfPTable(1);
			    PdfPCell tc1 = new PdfPCell(new Phrase("e - QUOTATION",qTitle));
			    tc1.setHorizontalAlignment(Element.ALIGN_CENTER);
			    tc1.setBorder(Rectangle.NO_BORDER);
			    table1.addCell(tc1);
			    document.add(table1);
			    
			    //////////////////////////////////////////Main Table 2 //////////////////////////////////////////////
			    PdfPTable table2 = new PdfPTable(2);
			    table2.setWidthPercentage(100);
			    PdfPCell t2c1 = new PdfPCell();
			    t2c1.setPadding(10);
			    t2c1.addElement(new Phrase("CONSIGNOR/ SUPPLIER : ",F10BoldB));
			    t2c1.addElement(new Phrase("EtchON Marks Control ",F12BoldR));			    
			    t2c1.addElement(new Phrase("Sector A 84,  Five Star MIDC Area,  Shendra  ",F10B));
			    t2c1.addElement(new Phrase("Aurangabad – 431007, Maharashtra, India ",F10B));
			    t2c1.addElement(new Phrase(""));
			    t2c1.addElement(new Phrase("Phone : +91-240-6050163/64/65, 9923638463",F10B));
			    table2.addCell(t2c1);
			    
				    //Table 3
				    PdfPTable table3 = new PdfPTable(2);
				    table3.setWidthPercentage(100);
				    
				    PdfPCell t2c2 = new PdfPCell();
				    /*t2c2.setBorder(Rectangle.NO_BORDER);
				    t2c2.setPaddingTop(0);
				    t2c2.setPaddingBottom(0);
				    t2c2.setBorderWidthLeft(0);
				    t2c2.setBorderWidthRight(0);
				    t2c2.setPaddingRight(1);*/
				    t2c2.setPadding(0);
				    t2c2.setBorder(Rectangle.NO_BORDER);
				    
				    
				    PdfPCell t3c1 = new PdfPCell();
				    t3c1.setPadding(3);
				    t3c1.addElement(new Phrase("Quotation Number",F10BoldR));
				    t3c1.addElement(new Phrase("Q{2K160416}-001",F10BoldB));
				    table3.addCell(t3c1);
				    
				    PdfPCell t3c2 = new PdfPCell();
				    t3c2.setPadding(3);
				    t3c2.addElement(new Phrase("Date",F10BoldR));
				    t3c2.addElement(new Phrase("{Date}",F10BoldB));
				    table3.addCell(t3c2);
				    
				    PdfPCell t3c3 = new PdfPCell();
				    t3c3.setPadding(3);
				    t3c3.addElement(new Phrase("Reference Enquiry -",F10BoldB));
				    t3c3.addElement(new Phrase("Online Cart ",F10B));
				    table3.addCell(t3c3);
				    
				    PdfPCell t3c4 = new PdfPCell();
				    t3c4.setPadding(3);
				    t3c4.addElement(new Phrase("Date-",F10BoldB));
				    t3c4.addElement(new Phrase("{Date}",F10B));
				    table3.addCell(t3c4);
				    
				    PdfPCell t3c5 = new PdfPCell();
				    t3c5.setPadding(3);
				    t3c5.addElement(new Phrase("Dispatch Thro",F10BoldB));
				    t3c5.addElement(new Phrase("Transport / Courier ",F10B));
				    table3.addCell(t3c5);
				    
				    PdfPCell t3c6 = new PdfPCell();
				    t3c6.setPadding(3);
				    t3c6.addElement(new Phrase("Place of Deliver",F10BoldB));
				    t3c6.addElement(new Phrase("{ Location}",F10B));
				    table3.addCell(t3c6);
			    
				    t2c2.addElement(table3);
				table2.addCell(t2c2); 
				
				PdfPCell t2c3 = new PdfPCell();
				t2c3.setPadding(10);
				t2c3.addElement(new Phrase("CONSIGNEE / CUSTOMER :  ",F10BoldB));
				t2c3.addElement(new Phrase("{ Client Name and Shipping Address } ",F10B));		
				table2.addCell(t2c3);
				    
				PdfPCell t2c4 = new PdfPCell();
				t2c4.setPadding(10);
				t2c4.addElement(new Phrase("Our Registration Details :",F10BoldR));
				t2c4.addElement(new Phrase("M VAT TIN Number         : 27830340883V ",F10B));	
				t2c4.addElement(new Phrase("CST Number               : 27830340883C",F10B));
				table2.addCell(t2c4);
				
			    document.add(table2);
			    
			    ///////////////////////////////////////////////////////// Main Table 3 /////////////////////////////////////////////////////
			    Paragraph preface1 = new Paragraph();
			    addEmptyLine(preface1, 1, document);
			    
			    PdfPTable table4 = new PdfPTable(6);
			    table4.setWidthPercentage(100);

			    table4.addCell(new Phrase("SN",F10B));
			    table4.addCell(new Phrase("Description of Goods",F10BoldB));
			    table4.addCell(new Phrase("Qty",F10BoldB));
			    table4.addCell(new Phrase("Rate in INR ",F10BoldB));
			    table4.addCell(new Phrase("Discount ",F10BoldB));
			    table4.addCell(new Phrase("Price in INR",F10BoldB));
			    
			    table4.addCell(new Phrase("01",F10B));
			    
			    PdfPCell t4c1 = new PdfPCell();
			    t4c1.setPadding(2);
			    t4c1.addElement(new Phrase("{ Selected Items } ",F10B));
			    t4c1.addElement(new Phrase("* Download PDF for Technical Specification ",F10B));	
			    table4.addCell(t4c1);
			    
			    table4.addCell(new Phrase("1",F10B));
			    table4.addCell(new Phrase("",F10B));
			    table4.addCell(new Phrase("",F10B));
			    table4.addCell(new Phrase("",F10B));
			    
			    document.add(table4);
			    
				///////////////////////////////////////////////////////// Main Table 4 /////////////////////////////////////////////////////
				Paragraph preface2 = new Paragraph();
				addEmptyLine(preface2, 1, document);
				
				PdfPTable table5 = new PdfPTable(2);
				table5.setWidthPercentage(100);
				
				PdfPCell t5c1 = new PdfPCell();
				t5c1.setPadding(0);
				t5c1.setBorder(Rectangle.NO_BORDER);
				
						//table 4.1
					    PdfPTable table6 = new PdfPTable(1);
					    table6.setWidthPercentage(100);
					    
					    table6.addCell(" ");
					    
					    PdfPCell t6c1 = new PdfPCell();
					    t6c1.setPadding(3);
					    t6c1.addElement(new Phrase("Banker Details  :  ",F12BoldR));
					    t6c1.addElement(new Phrase("A/C Name : EtchON Marks Control ",F10B));
					    t6c1.addElement(new Phrase("Banker: CITIBank  A/c # 0004239504, NEFT : CITI0000019",F10B));
					    t6c1.addElement(new Phrase("Banker: HDFC Bank A/c #01132560006106, NEFT:HDFC0000113",F10B));
					    table6.addCell(t6c1);
					    
					    table6.addCell(new Phrase("Terms  and Conditions",F10BoldR));
				    
				t5c1.addElement(table6);
				table5.addCell(t5c1); 
				
				PdfPCell t5c2 = new PdfPCell();
				t5c2.setPadding(0);
				t5c2.setBorder(Rectangle.NO_BORDER);
				
						//table 4.2
					    PdfPTable table7 = new PdfPTable(2);
					    table7.setWidthPercentage(100);
					    
					    table7.addCell(new Phrase("Net Amount",F10BoldR));	table7.addCell(new Phrase("",F12BoldR));
					    table7.addCell(new Phrase("P & F @",F10BoldB));		table7.addCell(new Phrase(""));
					    table7.addCell(new Phrase("Freight @ ",F10BoldB));	table7.addCell(new Phrase(""));
					    table7.addCell(new Phrase("Sub Total ",F10BoldR));	table7.addCell(new Phrase(""));
					    table7.addCell(new Phrase("VAT @ 12.50% / CST @ 12.50% ",F10BoldB));	table7.addCell(new Phrase(""));
					    table7.addCell(new Phrase("Gross Amount",F10BoldR));	table7.addCell(new Phrase(""));
					    
				t5c2.addElement(table7);
				table5.addCell(t5c2);
				
				PdfPCell t5c3 = new PdfPCell();
				t5c3.setPadding(0);
				t5c3.setBorder(Rectangle.NO_BORDER);
				
						//table 4.3
					    PdfPTable table8 = new PdfPTable(2);
					    table8.setWidthPercentage(100);
					    
					    table8.addCell(new Phrase("")); 	table8.addCell(new Phrase("",F10B));
					    table8.addCell(new Phrase("Courier / Freight : ",F10B));		table8.addCell(new Phrase("Transport / Courier",F10B));
					    table8.addCell(new Phrase("Delivery Schedule :",F10B));		table8.addCell(new Phrase("Immediate after payment confirmation",F10B));
					    table8.addCell(new Phrase("Payment  Terms : ",F10B));		table8.addCell(new Phrase("100 % advance ",F10B));
					    table8.addCell(new Phrase("Local Tax & Duties :  ",F10B));		table8.addCell(new Phrase("At actual – Customer Account ",F10B));
					    table8.addCell(new Phrase("Special Instructions : ",F10B));		table8.addCell(new Phrase("NA",F10BoldR));
					    
				t5c3.addElement(table8);
				table5.addCell(t5c3);
				
				PdfPCell t5c4 = new PdfPCell();
				
				t5c4.addElement(new Phrase(" For EtchON Marks Control",F10BoldB));
				t5c4.addElement(new Phrase("Authorized ",F10BoldB));	
				
				table5.addCell(t5c4);
				
				document.add(table5);
			    
		        document.close();
	    }
	 
	 @RequestMapping(value = "/createPdfI")
	    public void createPdfI(HttpServletRequest request) throws IOException, DocumentException {
		
		 	  File dir = new File(request.getServletContext().getRealPath("")+ File.separator + "pdfFiles");
			  dir.mkdirs();
			  DEST = dir.getAbsolutePath()+File.separator+"SmlTableI.pdf";
		      File file = new File(DEST);
		      file.createNewFile();
		 
		  	  String FILE = file.getAbsolutePath();
		  	
		  	  Document document = new Document();
		      PdfWriter.getInstance(document, new FileOutputStream(FILE));
		      PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(FILE));
		      Paragraph preface = new Paragraph();
		      
		      // Add header footer
		      HeaderFooter event = new HeaderFooter();
		      writer.setPageEvent(event);
		      document.setMargins(45, 45, 70, 50);
		      
		      //Open pdf
		      document.open();
		      
			      for(int i=0; i<7; i++){
			    	  preface.add(new Paragraph("Title of the document", catFont));
					   
				      document.add(preface);
			      }
		      
		      //-------------------------------------------------------------------------------
		      
		     
			    BaseFont base = BaseFont.createFont("C:/Windows/Fonts/Arial.ttf", BaseFont.WINANSI, false);
				Font qTitle = new Font(base, 14, Font.BOLD);
				
				Font F10BoldB = new Font(base, 10, Font.BOLD);
				Font F12BoldR = new Font(base, 12, Font.BOLD, BaseColor.RED);
				Font F10BoldR = new Font(base, 10, Font.BOLD, BaseColor.RED);
				Font F10B = new Font(base, 10, Font.NORMAL);
				
				//////////////////////////////////////////Main Table 1//////////////////////////////////////////////
			    PdfPTable table1 = new PdfPTable(1);
			    PdfPCell tc1 = new PdfPCell(new Phrase("Proforma Invoice ",qTitle));
			    tc1.setHorizontalAlignment(Element.ALIGN_CENTER);
			    tc1.setBorder(Rectangle.NO_BORDER);
			    table1.addCell(tc1);
			    document.add(table1);
			    
			    //////////////////////////////////////////Main Table 2 //////////////////////////////////////////////
			    PdfPTable table2 = new PdfPTable(2);
			    table2.setWidthPercentage(100);
			    PdfPCell t2c1 = new PdfPCell();
			    t2c1.setPadding(10);
			    t2c1.addElement(new Phrase("Exporter/Supplier : ",F10BoldB));
			    t2c1.addElement(new Phrase("EtchON Marks Control ",F12BoldR));			    
			    t2c1.addElement(new Phrase("Sector A 84,  Five Star MIDC Area,  Shendra  ",F10B));
			    t2c1.addElement(new Phrase("Aurangabad – 431007, Maharashtra, India ",F10B));
			    t2c1.addElement(new Phrase("Contact  : +91-240-6050163/64/65, 9923638463",F10B));
			    table2.addCell(t2c1);
			    
				    //Table 3
				    PdfPTable table3 = new PdfPTable(2);
				    table3.setWidthPercentage(100);
				    
				    PdfPCell t2c2 = new PdfPCell();
				    t2c2.setPadding(0);
				    t2c2.setBorder(Rectangle.NO_BORDER);
				    
				    
				    PdfPCell t3c1 = new PdfPCell();
				    t3c1.setPadding(3);
				    t3c1.addElement(new Phrase("Invoice Number ",F10BoldB));
				    t3c1.addElement(new Phrase("2K1516PI-4129ME",F10BoldR));
				    table3.addCell(t3c1);
				    
				    PdfPCell t3c2 = new PdfPCell();
				    t3c2.setPadding(3);
				    t3c2.addElement(new Phrase("Date",F10BoldB));
				    t3c2.addElement(new Phrase("{Date}",F10BoldB));
				    table3.addCell(t3c2);
				    
				    PdfPCell t3c3 = new PdfPCell();
				    t3c3.setPadding(3);
				    t3c3.addElement(new Phrase("Place  of Loading ",F10B));
				    t3c3.addElement(new Phrase("Aurangabad – 431201 ",F10B));
				    table3.addCell(t3c3);
				    
				    PdfPCell t3c4 = new PdfPCell();
				    t3c4.setPadding(3);
				    t3c4.addElement(new Phrase("Place  of Discharge  ",F10B));
				    t3c4.addElement(new Phrase("Silvasaa – 396 230",F10B));
				    table3.addCell(t3c4);
				    
				    PdfPCell t3c5 = new PdfPCell();
				    t3c5.setPadding(3);
				    t3c5.addElement(new Phrase("Dispatch Through ",F10B));
				    t3c5.addElement(new Phrase("Courier ",F10B));
				    table3.addCell(t3c5);
				    
				    PdfPCell t3c6 = new PdfPCell();
				    t3c6.setPadding(3);
				    t3c6.addElement(new Phrase("Reference PO ",F10BoldB));
				    t3c6.addElement(new Phrase("772 / 15-16",F10B));
				    table3.addCell(t3c6);
			    
				    t2c2.addElement(table3);
				table2.addCell(t2c2); 
				
				PdfPCell t2c3 = new PdfPCell();
				t2c3.setPadding(10);
				t2c3.addElement(new Phrase("Receiver / Invoice to, ",F10BoldB));
				t2c3.addElement(new Phrase("Kristeel Shinwa Ind. Ltd. ",F12BoldR));		
				t2c3.addElement(new Phrase("47, Government Industrial Estate,  Post Box. 88,",F10B));
				t2c3.addElement(new Phrase("Masat, Silvassa – 396 230 ",F10B));
				table2.addCell(t2c3);
				    
				PdfPCell t2c4 = new PdfPCell();
				t2c4.setPadding(10);
				t2c4.addElement(new Phrase("Our Vat and CST Registration Details : ",F10BoldR));
				t2c4.addElement(new Phrase("M VAT TIN Number  : 27830340883V ",F10B));	
				t2c4.addElement(new Phrase("CST Number               : 27830340883C",F10B));
				table2.addCell(t2c4);
				
			    document.add(table2);
			    
			    ///////////////////////////////////////////////////////// Main Table 3 /////////////////////////////////////////////////////
			    Paragraph preface1 = new Paragraph();
			    addEmptyLine(preface1, 1, document);
			    
			    PdfPTable table4 = new PdfPTable(6);
			    table4.setWidthPercentage(100);

			    table4.addCell(new Phrase("SN",F10B));
			    table4.addCell(new Phrase("Description of Goods",F10BoldB));
			    table4.addCell(new Phrase("Qty",F10BoldB));
			    table4.addCell(new Phrase("Rate in INR ",F10BoldB));
			    table4.addCell(new Phrase("Discount ",F10BoldB));
			    table4.addCell(new Phrase("Price in INR",F10BoldB));
			    
			    table4.addCell(new Phrase("01",F10B));
			    
			    PdfPCell t4c1 = new PdfPCell();
			    t4c1.setPadding(2);
			    t4c1.addElement(new Phrase("{ Selected Items } ",F10B));
			    t4c1.addElement(new Phrase("* Download PDF for Technical Specification ",F10B));	
			    table4.addCell(t4c1);
			    
			    table4.addCell(new Phrase("1",F10B));
			    table4.addCell(new Phrase("",F10B));
			    table4.addCell(new Phrase("",F10B));
			    table4.addCell(new Phrase("",F10B));
			    
			    document.add(table4);
			    
				///////////////////////////////////////////////////////// Main Table 4 /////////////////////////////////////////////////////
				Paragraph preface2 = new Paragraph();
				addEmptyLine(preface2, 1, document);
				
				PdfPTable table5 = new PdfPTable(2);
				table5.setWidthPercentage(100);
				
				PdfPCell t5c1 = new PdfPCell();
				t5c1.setPadding(0);
				t5c1.setBorder(Rectangle.NO_BORDER);
				
						//table 4.1
					    PdfPTable table6 = new PdfPTable(1);
					    table6.setWidthPercentage(100);
					    
					    table6.addCell(" ");
					    
					    PdfPCell t6c1 = new PdfPCell();
					    t6c1.setPadding(3);
					    t6c1.addElement(new Phrase("Banker Details  :  ",F12BoldR));
					    t6c1.addElement(new Phrase("A/C Name : EtchON Marks Control ",F10B));
					    t6c1.addElement(new Phrase("Banker: CITIBank  A/c # 0004239504, NEFT : CITI0000019",F10B));
					    t6c1.addElement(new Phrase("Banker: HDFC Bank A/c #01132560006106, NEFT:HDFC0000113",F10B));
					    table6.addCell(t6c1);
					    
					    table6.addCell(new Phrase("Terms  and Conditions",F10BoldR));
				    
				t5c1.addElement(table6);
				table5.addCell(t5c1); 
				
				PdfPCell t5c2 = new PdfPCell();
				t5c2.setPadding(0);
				t5c2.setBorder(Rectangle.NO_BORDER);
				
						//table 4.2
					    PdfPTable table7 = new PdfPTable(2);
					    table7.setWidthPercentage(100);
					    
					    table7.addCell(new Phrase("Net Amount",F10BoldR));	table7.addCell(new Phrase("",F12BoldR));
					    table7.addCell(new Phrase("P & F @",F10BoldB));		table7.addCell(new Phrase(""));
					    table7.addCell(new Phrase("Freight @ ",F10BoldB));	table7.addCell(new Phrase(""));
					    table7.addCell(new Phrase("Sub Total ",F10BoldR));	table7.addCell(new Phrase(""));
					    table7.addCell(new Phrase("VAT @ 12.50% / CST @ 12.50% ",F10BoldB));	table7.addCell(new Phrase(""));
					    table7.addCell(new Phrase("Gross Amount",F10BoldR));	table7.addCell(new Phrase(""));
					    
				t5c2.addElement(table7);
				table5.addCell(t5c2);
				
				PdfPCell t5c3 = new PdfPCell();
				t5c3.setPadding(0);
				t5c3.setBorder(Rectangle.NO_BORDER);
				
						//table 4.3
					    PdfPTable table8 = new PdfPTable(2);
					    table8.setWidthPercentage(100);
					    
					    table8.addCell(new Phrase("")); 	table8.addCell(new Phrase("",F10B));
					    table8.addCell(new Phrase("Courier / Freight : ",F10B));		table8.addCell(new Phrase("Transport / Courier",F10B));
					    table8.addCell(new Phrase("Delivery Schedule :",F10B));		table8.addCell(new Phrase("Immediate after payment confirmation",F10B));
					    table8.addCell(new Phrase("Payment  Terms : ",F10B));		table8.addCell(new Phrase("100 % advance ",F10B));
					    table8.addCell(new Phrase("Local Tax & Duties :  ",F10B));		table8.addCell(new Phrase("At actual – Customer Account ",F10B));
					    table8.addCell(new Phrase("Special Instructions : ",F10B));		table8.addCell(new Phrase("NA",F10BoldR));
					    
				t5c3.addElement(table8);
				table5.addCell(t5c3);
				
				PdfPCell t5c4 = new PdfPCell();
				
				t5c4.addElement(new Phrase(" For EtchON Marks Control",F10BoldB));
				t5c4.addElement(new Phrase("Authorized ",F10BoldB));	
				
				table5.addCell(t5c4);
				
				document.add(table5);
			    
		        document.close();
	    }
	 
	 	private void p(String string, Font f10b) {
		// TODO Auto-generated method stub
		
	}



		private static void addEmptyLine(Paragraph paragraph, int number, Document d) throws DocumentException {
		    for (int i = 0; i < number; i++) {
		      paragraph.add(new Paragraph(" ")); d.add(paragraph);
		    }
		 }
	 
	 
	 	static class HeaderFooter extends PdfPageEventHelper {
	 		 Image img2; Image img1;
	 		 
	 		 public void onStartPage(PdfWriter writer, Document document) {
			    // add header footer image
			    try {
			    	  img2 =  Image.getInstance("D:/etchon_all/Etchon2.jpg");
					  img2.scaleToFit(500,80);
				      img2.setAbsolutePosition(45, 10);
				      writer.getDirectContent().addImage(img2);
				      
				      img1 =  Image.getInstance("D:/etchon_all/Etchon1.jpg");
				      img1.scaleToFit(500,80);
				      img1.setAbsolutePosition(45, 780);
				      writer.getDirectContent().addImage(img1);
				      
			    } catch (Exception x) {
			      x.printStackTrace();
			      System.out.println(x.getMessage());
			    }
			  }
	 	 }
}
