package com.warrior.mapper;


import com.warrior.entity.Equipment;
import com.warrior.entity.EquipmentMaintenance;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EquipmentMaintenanceMapper {
    //1
    public void addEquipmentMaintenance(EquipmentMaintenance equipmentMaintenance);
    //2
    public List<EquipmentMaintenance> selectByEquipmentId(Integer equipmentId);
}
