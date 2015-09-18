package com.alpiresac.awore.persistence;

import com.alpiresac.awore.domain.Tlocalparametria;

public interface TlocalparametriaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tlocalparametria record);

    int insertSelective(Tlocalparametria record);

    Tlocalparametria selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tlocalparametria record);

    int updateByPrimaryKey(Tlocalparametria record);
}