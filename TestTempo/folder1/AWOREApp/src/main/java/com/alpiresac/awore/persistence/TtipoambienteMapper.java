package com.alpiresac.awore.persistence;

import com.alpiresac.awore.domain.Ttipoambiente;

public interface TtipoambienteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Ttipoambiente record);

    int insertSelective(Ttipoambiente record);

    Ttipoambiente selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ttipoambiente record);

    int updateByPrimaryKey(Ttipoambiente record);
}