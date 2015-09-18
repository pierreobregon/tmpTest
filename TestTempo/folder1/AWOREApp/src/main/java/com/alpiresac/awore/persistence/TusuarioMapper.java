package com.alpiresac.awore.persistence;

import com.alpiresac.awore.domain.Tusuario;

public interface TusuarioMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tusuario record);

    int insertSelective(Tusuario record);

    Tusuario selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tusuario record);

    int updateByPrimaryKey(Tusuario record);
}