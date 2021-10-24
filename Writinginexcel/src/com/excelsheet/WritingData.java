package com.excelsheet;

import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.File;
import jxl.write.biff.RowsExceededException;

public class WritingData {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		// TODO Auto-generated method stub

	java.io.File file =new java.io.File("D:Book3.xls");
	
	WritableWorkbook wb=Workbook.createWorkbook(file);
	
	WritableSheet sheet=wb.createSheet("Book3",1);
	
	Label ll=new Label(0,0,"Name");
	
	
	sheet.addCell(ll);
	
	
	sheet.addCell(new Label(0,1,"ajay"));
	
	sheet.addCell(new Label(0,2,"aniket"));
	
	sheet.addCell(new Label(0,3,"gous"));
	
	sheet.addCell(new Label(0,4,"upsi"));
	
	
	
	wb.write();
	
	wb.close();
	
		
	}

}
