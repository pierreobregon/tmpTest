package com.alpiresac.awore.persistence;

import java.util.List;

import com.alpiresac.awore.domain.Ttipoplantilla;

public interface TtipoplantillaMapper {
    int deleteByPrimaryKey(String codiTipoPlantilla);

    int insert(Ttipoplantilla record);

    int insertSelective(Ttipoplantilla record);

    Ttipoplantilla selectByPrimaryKey(String codiTipoPlantilla);

    int updateByPrimaryKeySelective(Ttipoplantilla record);

    int updateByPrimaryKey(Ttipoplantilla record);
    
    public List<Ttipoplantilla> selectAll();
}