package com.alpiresac.awore.persistence;

import com.alpiresac.awore.domain.Tservicios;

public interface TserviciosMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tservicios record);

    int insertSelective(Tservicios record);

    Tservicios selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tservicios record);

    int updateByPrimaryKey(Tservicios record);
}