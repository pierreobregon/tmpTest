package com.alpiresac.awore.persistence;

import com.alpiresac.awore.domain.Taplicacion;

public interface TaplicacionMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(Taplicacion record);

    int insertSelective(Taplicacion record);

    Taplicacion selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(Taplicacion record);

    int updateByPrimaryKey(Taplicacion record);
}