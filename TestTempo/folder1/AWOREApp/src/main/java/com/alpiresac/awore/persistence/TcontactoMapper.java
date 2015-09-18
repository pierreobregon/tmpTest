package com.alpiresac.awore.persistence;

import com.alpiresac.awore.domain.Tcontacto;

public interface TcontactoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tcontacto record);

    int insertSelective(Tcontacto record);

    Tcontacto selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tcontacto record);

    int updateByPrimaryKey(Tcontacto record);
}