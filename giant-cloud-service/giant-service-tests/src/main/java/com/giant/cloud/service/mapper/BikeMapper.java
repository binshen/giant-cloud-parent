package com.giant.cloud.service.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BikeMapper {

    @Select("SELECT bikemodel_name FROM t_giant_bikemodel")
    List<String> getBikeList();
}
