package com.alpiresac.awore.persistence;

import com.alpiresac.awore.domain.Tambiente;

public interface TambienteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tambiente record);

    int insertSelective(Tambiente record);

    Tambiente selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tambiente record);

    int updateByPrimaryKey(Tambiente record);
}