package com.shop.mybatis;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface MyBatisBestItemMapper {
    List<MybatisBestItemDto> getBestItemInfo();
}
