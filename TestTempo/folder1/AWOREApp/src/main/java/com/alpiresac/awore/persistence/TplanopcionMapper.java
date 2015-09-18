package com.alpiresac.awore.persistence;

import com.alpiresac.awore.domain.Tplanopcion;

public interface TplanopcionMapper {
    int deleteByPrimaryKey(String codiOpci);

    int insert(Tplanopcion record);

    int insertSelective(Tplanopcion record);

    Tplanopcion selectByPrimaryKey(String codiOpci);

    int updateByPrimaryKeySelective(Tplanopcion record);

    int updateByPrimaryKey(Tplanopcion record);
}