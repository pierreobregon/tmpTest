package com.alpiresac.awore.persistence;

import com.alpiresac.awore.domain.Tcuenta;

public interface TcuentaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tcuenta record);

    int insertSelective(Tcuenta record);

    Tcuenta selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tcuenta record);

    int updateByPrimaryKey(Tcuenta record);
}