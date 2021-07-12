package com.mzk.oracledbwalletdemo.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author miaozhenkai
 * @version 2021-07-06  15:39
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TestTbl implements Serializable {
    private BigDecimal id;

    private String name;

    private static final long serialVersionUID = 1L;
}