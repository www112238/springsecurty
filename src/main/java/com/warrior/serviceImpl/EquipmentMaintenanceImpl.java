package com.warrior.serviceImpl;

import com.warrior.entity.Equipment;
import com.warrior.entity.EquipmentMaintenance;
import com.warrior.mapper.EquipmentMaintenanceMapper;
import com.warrior.service.IEquipmentMaintenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EquipmentMaintenanceImpl implements IEquipmentMaintenanceService {

    @Autowired
    private EquipmentMaintenanceMapper equipmentMaintenanceMapper;
    //1
    @Override
    public EquipmentMaintenance addEquipmentMaintenance(EquipmentMaintenance equipmentMaintenance) {
        equipmentMaintenanceMapper.addEquipmentMaintenance(equipmentMaintenance);
        return equipmentMaintenance;
    }
    //2
    @Override
    public List<EquipmentMaintenance> selectByEquipmentId(Integer equipmentId) {
        List<EquipmentMaintenance> equipmentMaintenancesList = equipmentMaintenanceMapper.selectByEquipmentId(equipmentId);
        return equipmentMaintenancesList;
    }
}
