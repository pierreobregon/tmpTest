package com.alpiresac.awore.persistence;

import com.alpiresac.awore.domain.Tambienteaccesorio;

public interface TambienteaccesorioMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tambienteaccesorio record);

    int insertSelective(Tambienteaccesorio record);

    Tambienteaccesorio selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tambienteaccesorio record);

    int updateByPrimaryKey(Tambienteaccesorio record);
}