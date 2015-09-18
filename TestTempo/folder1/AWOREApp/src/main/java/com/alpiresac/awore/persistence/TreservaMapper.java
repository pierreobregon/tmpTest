package com.alpiresac.awore.persistence;

import com.alpiresac.awore.domain.Treserva;

public interface TreservaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Treserva record);

    int insertSelective(Treserva record);

    Treserva selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Treserva record);

    int updateByPrimaryKey(Treserva record);
}