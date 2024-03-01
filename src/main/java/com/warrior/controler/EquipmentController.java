package com.warrior.controler;


import com.warrior.entity.Equipment;
import com.warrior.entity.EquipmentMaintenance;
import com.warrior.mapper.EquipmentMaintenanceMapper;
import com.warrior.service.IEquipmentMaintenanceService;
import com.warrior.service.IEquipmentService;
import com.warrior.serviceImpl.EquipmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.*;

@RestController
@RequestMapping("/api/equipment")
public class EquipmentController {
    @Autowired
    private IEquipmentService iEquipmentService;//注册service还是实现类？？？？



    @GetMapping( "/allequipment")
    @ResponseBody
    public List<Equipment> findAllEquipment(){

        List<Equipment> allEquipment = iEquipmentService.findAllEquipment();
        return allEquipment;
    }

    //1添加设备信息接口

    /**
     * 添加 要先添加 在
     * @param
     * @return
     */
    @PostMapping("/add")
    @ResponseBody
    public Equipment addEquipment(Equipment equipment){
        Equipment insertEquipment = iEquipmentService.addEquipment(equipment);
        return insertEquipment;
    }

    //2查询设备信息接口
    // 也要包含子类得信息 一个事返回
    @GetMapping("/{equipmentId}")
    @ResponseBody
    public Equipment selectById(@PathVariable("equipmentId") Integer equipmentId){
        Equipment searchEquipment = iEquipmentService.selectById(equipmentId);
        return searchEquipment;

    }

    @Autowired
    IEquipmentMaintenanceService iEquipmentMaintenanceService;//注入service接口还是实现类？？？？

    //3添加设备维护记录接口
    @PostMapping("/maintenance/add")
    @ResponseBody
    public EquipmentMaintenance addEquipmentMaintenance(EquipmentMaintenance equipmentMaintenance){
        EquipmentMaintenance addEquipmentMaintenance = iEquipmentMaintenanceService.addEquipmentMaintenance(equipmentMaintenance);
        return addEquipmentMaintenance;
    }

    //3.1批量添加设备维护记录接口



    //4查询设备维护记录接口
    @GetMapping("/maintenance/{equipmentId}")
    @ResponseBody
    public List<EquipmentMaintenance> selectMaintenanceById(@PathVariable("equipmentId") Integer equipmentId){
        List<EquipmentMaintenance> equipmentMaintenanceList = iEquipmentMaintenanceService.selectByEquipmentId(equipmentId);
        return equipmentMaintenanceList;

    }

    //5查询设备状态接口
    @GetMapping("/status/{equipmentId}")
    @ResponseBody
    public LinkedHashMap<String, String> getStatusByEquipmentId(@PathVariable("equipmentId") Integer equipmentId){
        Equipment equipment = iEquipmentService.selectById(equipmentId);
        LinkedHashMap<String,String> maplist = new LinkedHashMap();

        maplist.put("equipment_id",String.valueOf(equipment.getEquipmentId()));
        maplist.put("name",equipment.getName());
        maplist.put("status",equipment.getStatus());
        return maplist;
    }



    //6根据部门或者设备查询维护次数和费用

    @GetMapping("/total/{Type}")
    @ResponseBody
    public HashMap<String,Object> selectTotalBy(@PathVariable("Type") String Type){

        if ("department".equals(Type)){
            return iEquipmentService.selectTotalByDepartment(Type);
        }else if("equipment".equals(Type)){
            return iEquipmentService.selectTotalByEquipment(Type);
        }else{

            return null;

        }


    }

    //7根据父表id查询父子数据
    @GetMapping("/fuzi/{equipmentId}")
    @ResponseBody
    public Equipment selectFuZiById(@PathVariable("equipmentId") Integer equipmentId){
        Equipment selectEquipment = iEquipmentService.selectById(equipmentId);
        List<EquipmentMaintenance> equipmentMaintenances = iEquipmentMaintenanceService.selectByEquipmentId(equipmentId);
        selectEquipment.setEquipmentMaintenances(equipmentMaintenances);
        return selectEquipment;

    }
}
