package com.alpiresac.awore.persistence;

import com.alpiresac.awore.domain.Tplantilla;

public interface TplantillaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tplantilla record);

    int insertSelective(Tplantilla record);

    Tplantilla selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tplantilla record);

    int updateByPrimaryKey(Tplantilla record);
}