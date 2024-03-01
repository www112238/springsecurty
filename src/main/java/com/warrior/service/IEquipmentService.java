package com.warrior.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.warrior.entity.Equipment;
import com.warrior.entity.EquipmentMaintenance;
import com.warrior.mapper.EquipmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public interface IEquipmentService {


    List<Equipment> findAllEquipment();
    //1
    Equipment addEquipment(Equipment equipment);
    //2
    Equipment selectById(Integer equipmentId);
    //5
    HashMap<String,Object> selectTotalByDepartment(String type);
    HashMap<String,Object> selectTotalByEquipment(String type);



}
