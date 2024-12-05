package com.kairos.uploadFiles.dto;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GoodType {
    @Excel(name = "typeId",  width = 20,height = 8)
    private String typeId;
    @Excel(name = "typeName",  width = 20,height = 8)
    private String typeName;
}
