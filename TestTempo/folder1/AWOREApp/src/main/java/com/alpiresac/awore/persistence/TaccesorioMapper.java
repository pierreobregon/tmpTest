package com.alpiresac.awore.persistence;

import com.alpiresac.awore.domain.Taccesorio;

public interface TaccesorioMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Taccesorio record);

    int insertSelective(Taccesorio record);

    Taccesorio selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Taccesorio record);

    int updateByPrimaryKey(Taccesorio record);
}