package com.kairos.uploadFiles.dto;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelCollection;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
@Data
@NoArgsConstructor
public class Goods {
    @Excel(name = "NO",needMerge = true ,width = 20)
    private Integer no;
    @Excel(name = "name",needMerge = true ,width = 20)
    private String name;
    @Excel(name = "shelfLife",width = 20,needMerge = true ,exportFormat = "yyyy-MM-dd")
    private LocalDate shelfLife;
    @ExcelCollection(name = "goodTypes")
    private List<GoodType> goodTypes;
}
