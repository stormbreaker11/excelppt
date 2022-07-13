
package com.app.exceltoppt;

import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.poi.sl.usermodel.TableCell.BorderEdge;
import org.apache.poi.sl.usermodel.TextParagraph.TextAlign;
import org.apache.poi.xslf.usermodel.SlideLayout;
import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFSlide;
import org.apache.poi.xslf.usermodel.XSLFSlideLayout;
import org.apache.poi.xslf.usermodel.XSLFSlideMaster;
import org.apache.poi.xslf.usermodel.XSLFTable;
import org.apache.poi.xslf.usermodel.XSLFTableCell;
import org.apache.poi.xslf.usermodel.XSLFTableRow;
import org.apache.poi.xslf.usermodel.XSLFTextParagraph;
import org.apache.poi.xslf.usermodel.XSLFTextRun;
import org.apache.poi.xslf.usermodel.XSLFTextShape;


public class CreatePPTXTable {
	
	
	public static void generateTable(Map<String, Integer> requiredHeaders, List<Employee> employees) throws IOException {
		

		  XMLSlideShow ppt = new XMLSlideShow();
		  
		  //getting the slide master object
	      XSLFSlideMaster slideMaster = ppt.getSlideMasters().get(0);
	      
	      //get the desired slide layout 
	      XSLFSlideLayout titleLayout = slideMaster.getLayout(SlideLayout.TITLE);
	                                                     
	      //creating a slide with title layout
	      XSLFSlide slide1 = ppt.createSlide(titleLayout);
	      
	      //selecting the place holder in it 
	      XSLFTextShape title1 = slide1.getPlaceholder(0); 
	      
	      //setting the title init 
	      title1.setText("Employees List");
	      
		  XSLFSlide slide = ppt.createSlide();

		  XSLFTableCell cell;
		  XSLFTextParagraph p;
		  XSLFTextRun line;

		  XSLFTable tbl = slide.createTable();
		  tbl.setAnchor(new Rectangle(new Point(100, 100)));

		  XSLFTableRow headerRow = tbl.addRow();
		  headerRow.setHeight(45);

			/*
			 * for(int i = 0; i < 5; i++) { XSLFTableCell th = headerRow.addCell(); p =
			 * th.addNewTextParagraph(); p.setTextAlign(TextAlign.CENTER); line =
			 * p.addNewTextRun(); line.setText("Header " + i);
			 * th.setBorderWidth(BorderEdge.bottom, 2.0);
			 * th.setBorderColor(BorderEdge.bottom, Color.black); }
			 */
		  Set<Entry<String, Integer>> entrySet = requiredHeaders.entrySet();
		  
		
			for (Entry<String, Integer> entry : entrySet) {
				XSLFTableCell th = headerRow.addCell();
				p = th.addNewTextParagraph();
				p.setTextAlign(TextAlign.CENTER);
				line = p.addNewTextRun();
				line.setText(entry.getKey());
				th.setBorderWidth(BorderEdge.bottom, 2.0);
				th.setBorderColor(BorderEdge.bottom, Color.black);
			}
		  
			/*
			 * for (int item = 0; item < 8; item++) { XSLFTableRow itemRow = tbl.addRow();
			 * for (int i = 0; i < 5; i++) { XSLFTableCell td = itemRow.addCell(); p =
			 * td.addNewTextParagraph(); p.setTextAlign(TextAlign.CENTER); line =
			 * p.addNewTextRun(); line.setText("Cell " + item + ":" + i); } }
			 */
			for (Employee employee : employees) {
				XSLFTableRow itemRow = tbl.addRow();
					XSLFTableCell td = itemRow.addCell();
					p = td.addNewTextParagraph();
					p.setTextAlign(TextAlign.CENTER);
					line = p.addNewTextRun();
					line.setText(""+employee.getId());

					td = itemRow.addCell();
					p = td.addNewTextParagraph();
					p.setTextAlign(TextAlign.CENTER);
					line = p.addNewTextRun();
					line.setText(employee.getName());
					
					td = itemRow.addCell();
					p = td.addNewTextParagraph();
					p.setTextAlign(TextAlign.CENTER);
					line = p.addNewTextRun();
					line.setText(employee.getDesignation());

					td = itemRow.addCell();
					p = td.addNewTextParagraph();
					p.setTextAlign(TextAlign.CENTER);
					line = p.addNewTextRun();
					line.setText(employee.getDepartment());
					
					td = itemRow.addCell();
					p = td.addNewTextParagraph();
					p.setTextAlign(TextAlign.CENTER);
					line = p.addNewTextRun();
					line.setText(employee.getSalary()+"");
			}
			 
		  
		  FileOutputStream out;
		try {
			out = new FileOutputStream("D://fileName.pptx");
			System.out.println("PPT Created");
			 ppt.write(out);
			  out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
			
		}
		
		  
}

