package com.warrior.service;


import com.warrior.entity.Equipment;
import com.warrior.entity.EquipmentMaintenance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;


public interface IEquipmentMaintenanceService {



    //1
    EquipmentMaintenance addEquipmentMaintenance(EquipmentMaintenance equipmentMaintenance);
    //2
//     EquipmentMaintenance selectByEquipmentId(Integer equipmentId);
    List<EquipmentMaintenance> selectByEquipmentId(Integer equipmentId);
}

