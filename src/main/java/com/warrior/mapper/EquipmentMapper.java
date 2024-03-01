package com.warrior.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.warrior.entity.Equipment;
import org.apache.ibatis.annotations.Mapper;

import java.util.LinkedHashMap;
import java.util.List;

@Mapper
public interface EquipmentMapper extends BaseMapper<Equipment> {

    public List<Equipment> findAllEquipment();
    //1
    public void addEquipment(Equipment equipment);
    //2
    public Equipment selectByEquipmentId(Integer equipmentId);
    //5

    public List<LinkedHashMap<String,Integer>> selectTotalCountByDepartMap(String Type);
    public List<LinkedHashMap<String,Double>> selectTotalCostByDepartMap(String Type);
    public List<LinkedHashMap<String,Integer>> selectTotalCountByEquipMap(String Type);
    public List<LinkedHashMap<String,Double>> selectTotalCostByEquipMap(String Type);





}
