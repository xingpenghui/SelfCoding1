package com.feri.common.poi;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;

/**
 *@Author feri
 *@Date Created in 2019/1/19 15:34
 */
public class PoiExcel_Main {
    public static void main(String[] args) throws IOException {
//        String[] strings={"序号","姓名","成绩"};
//        exportExcel(strings);
        System.out.println(importExcel("成绩.xls"));
    }
    //导出  生成数据
    public static void exportExcel(String[] titles) throws IOException {
        //1、创建表格对象
        HSSFWorkbook  workbook=new HSSFWorkbook();
        //2、创建Sheet
        HSSFSheet sheet=workbook.createSheet("周考成绩表");
        //3、创建第一行
        HSSFRow row=sheet.createRow(0);
        //4、设置第一行的内容
        //单元格的样式
        HSSFCellStyle cellStyle=workbook.createCellStyle();
        //设置对齐方式
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
        HSSFFont font=workbook.createFont();
        font.setBold(true);
        font.setColor(HSSFFont.COLOR_RED);
        font.setFontHeightInPoints((short) 30);
        cellStyle.setFont(font);
        //设置字符个数
        sheet.setDefaultColumnWidth(30);

        for(int i=0;i<titles.length;i++){
            HSSFCell cell=row.createCell(i);
            cell.setCellStyle(cellStyle);
            cell.setCellValue(titles[i]);
        }
        HSSFCellStyle cellStyle1=workbook.createCellStyle();
        //设置对齐方式
        cellStyle1.setAlignment(HorizontalAlignment.LEFT);
        HSSFFont font1=workbook.createFont();

        font1.setColor(HSSFFont.COLOR_NORMAL);
        cellStyle1.setFont(font1);
        //5、设置写出的内容
        for(int i=1;i<101;i++){
            HSSFRow row1=sheet.createRow(i);
            setValeu(row1.createCell(0),cellStyle1,i+"");
            setValeu(row1.createCell(1),cellStyle1,"洪利"+i);
            setValeu(row1.createCell(2),cellStyle1,(new Random().nextInt(100)+1)+"");
        }
        //6、写出
        workbook.write(new File("成绩.xls"));


    }
    //导出  生成数据
    public static LinkedHashMap<Integer,List<String>> importExcel(String fn) throws IOException {
        //1、创建表格对象
        HSSFWorkbook  workbook=new HSSFWorkbook(new FileInputStream(fn));
        //2、创建Sheet
        HSSFSheet sheet=workbook.getSheet("周考成绩表");
        //3、
        LinkedHashMap<Integer,List<String>> map=new LinkedHashMap<>();
        int start=sheet.getFirstRowNum();
        int total=sheet.getLastRowNum();
        for(int i=start;i<=total;i++){
            HSSFRow row=sheet.getRow(i);
            //
            map.put(i,new ArrayList<>());
            int s1=row.getFirstCellNum();
            int t1=row.getLastCellNum();
            for(int j=s1;j<t1;j++){
                HSSFCell cell=row.getCell(j);
                map.get(i).add(cell.getStringCellValue());
            }
        }
        return map;

    }
    private static void setValeu(HSSFCell cell,HSSFCellStyle cellStyle,String v){
        cell.setCellValue(v);
        cell.setCellStyle(cellStyle);
    }
}
