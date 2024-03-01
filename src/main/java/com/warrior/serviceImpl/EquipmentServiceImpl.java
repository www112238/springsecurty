package com.warrior.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.warrior.entity.Equipment;
import com.warrior.mapper.EquipmentMapper;
import com.warrior.mapper.StudentMapper;
import com.warrior.service.IEquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

@Service
public class EquipmentServiceImpl  implements IEquipmentService {

    @Autowired
    private EquipmentMapper equipmentMapper;


    @Override
    public List<Equipment> findAllEquipment() {

        List<Equipment> allEquipment = equipmentMapper.findAllEquipment();
        //log
//        System.out.println("Returned Equipment List: " + allEquipment);
        return allEquipment;
    }
    //1
    @Override

    public Equipment addEquipment(Equipment equipment) {
        equipmentMapper.addEquipment(equipment);


        return equipment;
    }
    //2
    @Override
    @Transactional
    public Equipment selectById(Integer id) {
        Equipment equipment = equipmentMapper.selectByEquipmentId(id);
        return equipment;
    }
    //5
    //按部门查次数和费用
    @Override
    public HashMap<String,Object> selectTotalByDepartment(String type) {
        List<LinkedHashMap<String, Integer>> selectTotalCountByDepartMaps = equipmentMapper.selectTotalCountByDepartMap(type);
        List<LinkedHashMap<String, Double>> selectTotalCostByDepartMaps = equipmentMapper.selectTotalCostByDepartMap(type);
        HashMap<String,Object> Map = new HashMap<>();
        Map.put("维护次数",selectTotalCountByDepartMaps);
        Map.put("维护费用",selectTotalCostByDepartMaps);
        return Map;
    }


    //按设备查次数和费用
    @Override
    public HashMap<String,Object> selectTotalByEquipment(String type) {
        List<LinkedHashMap<String, Integer>> selectTotalCountByEquipMaps = equipmentMapper.selectTotalCountByEquipMap(type);
        List<LinkedHashMap<String, Double>> selectTotalCostByEquipMaps = equipmentMapper.selectTotalCostByEquipMap(type);
        HashMap<String,Object> Map = new HashMap<>();
        Map.put("维护次数",selectTotalCountByEquipMaps);
        Map.put("维护费用",selectTotalCountByEquipMaps);
        return Map;
    }





}
