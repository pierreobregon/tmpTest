package com.alpiresac.awore.persistence;

import com.alpiresac.awore.domain.Tlocal;

public interface TlocalMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tlocal record);

    int insertSelective(Tlocal record);

    Tlocal selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tlocal record);

    int updateByPrimaryKey(Tlocal record);
}