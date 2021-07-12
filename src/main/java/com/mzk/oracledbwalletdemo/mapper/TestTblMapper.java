package com.mzk.oracledbwalletdemo.mapper;

import com.mzk.oracledbwalletdemo.pojo.TestTbl;
import java.math.BigDecimal;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author miaozhenkai
 * @version 2021-07-06  15:39
 */
@Mapper
public interface TestTblMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(TestTbl record);

    int insertSelective(TestTbl record);

    TestTbl selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(TestTbl record);

    int updateByPrimaryKey(TestTbl record);
}