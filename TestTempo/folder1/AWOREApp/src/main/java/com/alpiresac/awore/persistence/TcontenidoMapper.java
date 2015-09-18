package com.alpiresac.awore.persistence;

import com.alpiresac.awore.domain.Tcontenido;
import org.apache.ibatis.annotations.Param;

public interface TcontenidoMapper {
    int deleteByPrimaryKey(@Param("idAplic") Integer idAplic, @Param("codiBloque") String codiBloque);

    int insert(Tcontenido record);

    int insertSelective(Tcontenido record);

    Tcontenido selectByPrimaryKey(@Param("idAplic") Integer idAplic, @Param("codiBloque") String codiBloque);

    int updateByPrimaryKeySelective(Tcontenido record);

    int updateByPrimaryKey(Tcontenido record);
}