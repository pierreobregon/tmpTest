package com.alpiresac.awore.persistence;

import com.alpiresac.awore.domain.Tparametria;
import org.apache.ibatis.annotations.Param;

public interface TparametriaMapper {
    int deleteByPrimaryKey(@Param("codi_para") String codi_para, @Param("codi_para_padre") String codi_para_padre);

    int insert(Tparametria record);

    int insertSelective(Tparametria record);

    Tparametria selectByPrimaryKey(@Param("codi_para") String codi_para, @Param("codi_para_padre") String codi_para_padre);

    int updateByPrimaryKeySelective(Tparametria record);

    int updateByPrimaryKey(Tparametria record);
}