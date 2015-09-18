package com.alpiresac.awore.persistence;

import com.alpiresac.awore.domain.Timagenrepo;

public interface TimagenrepoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Timagenrepo record);

    int insertSelective(Timagenrepo record);

    Timagenrepo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Timagenrepo record);

    int updateByPrimaryKeyWithBLOBs(Timagenrepo record);

    int updateByPrimaryKey(Timagenrepo record);
}