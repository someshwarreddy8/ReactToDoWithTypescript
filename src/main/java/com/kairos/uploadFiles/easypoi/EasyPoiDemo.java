package com.kairos.uploadFiles.easypoi;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import com.kairos.uploadFiles.dto.GoodType;
import com.kairos.uploadFiles.dto.Goods;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EasyPoiDemo {
    public static void main(String[] args) {
        Goods goods1 = new Goods();
        List<GoodType> goodTypeList1 = new ArrayList<>();
        GoodType goodType1 = new GoodType();
        goodType1.setTypeId("apple-1");
        goodType1.setTypeName("apple-red");
        goodTypeList1.add(goodType1);
        GoodType goodType2 = new GoodType();
        goodType2.setTypeId("apple-2");
        goodType2.setTypeName("apple-white");
        goodTypeList1.add(goodType2);
        goods1.setNo(110);
        goods1.setName("apple");
        goods1.setShelfLife(LocalDate.now());
        goods1.setGoodTypes(goodTypeList1);

        Goods goods2 = new Goods();
        List<GoodType> goodTypeList2 = new ArrayList<>();
        GoodType goodType21 = new GoodType();
        goodType21.setTypeId("wine-1");
        goodType21.setTypeName("wine-red");
        goodTypeList2.add(goodType21);
        GoodType goodType22 = new GoodType();
        goodType22.setTypeId("wine-2");
        goodType22.setTypeName("wine-white");
        goodTypeList2.add(goodType22);
        goods2.setNo(111);
        goods2.setName("wine");
        goods2.setShelfLife(LocalDate.now());
        goods2.setGoodTypes(goodTypeList2);

        List<Goods> goodsList = new ArrayList<Goods>();
        goodsList.add(goods1);
        goodsList.add(goods2);

//        ExportParams exportParams = new ExportParams("Product List", "Products");

        Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams(null,"Products"), Goods.class, goodsList);

        try (FileOutputStream fos = new FileOutputStream("src/main/resources/Products.xlsx")) {
            workbook.write(fos);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Close the workbook
        try {
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Exported to Excel file successfully!");
    }

}
