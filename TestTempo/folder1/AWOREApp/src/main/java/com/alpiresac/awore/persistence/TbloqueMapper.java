package com.alpiresac.awore.persistence;

import com.alpiresac.awore.domain.Tbloque;

public interface TbloqueMapper {
    int deleteByPrimaryKey(String codiBloque);

    int insert(Tbloque record);

    int insertSelective(Tbloque record);

    Tbloque selectByPrimaryKey(String codiBloque);

    int updateByPrimaryKeySelective(Tbloque record);

    int updateByPrimaryKey(Tbloque record);
}