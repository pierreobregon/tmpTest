package com.alpiresac.awore.persistence;

import com.alpiresac.awore.domain.Tpagos;

public interface TpagosMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tpagos record);

    int insertSelective(Tpagos record);

    Tpagos selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tpagos record);

    int updateByPrimaryKey(Tpagos record);
}