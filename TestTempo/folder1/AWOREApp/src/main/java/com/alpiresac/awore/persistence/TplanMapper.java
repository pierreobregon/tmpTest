package com.alpiresac.awore.persistence;

import com.alpiresac.awore.domain.Tplan;

public interface TplanMapper {
    int deleteByPrimaryKey(String codiPlan);

    int insert(Tplan record);

    int insertSelective(Tplan record);

    Tplan selectByPrimaryKey(String codiPlan);

    int updateByPrimaryKeySelective(Tplan record);

    int updateByPrimaryKey(Tplan record);
}