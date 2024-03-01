package com.warrior.entity;


import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;


import com.baomidou.mybatisplus.annotation.TableField;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


@TableName("equipment_sub")
@Data
public class EquipmentMaintenance {
    @TableId(value = "sub_id",type= IdType.AUTO)
    private Integer subId;
    @TableField("equipment_id")            //父表id
    private Integer equipmentId;
    @TableField("maintence_record")
    private String maintenanceRecord;
    @TableField("maintenance_date")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date maintenanceDate;
    @TableField("maintenance_person")
    private String maintenancePerson;
    @TableField("maintenance_cost")
    private double maintenanceCost;


    public EquipmentMaintenance() {
    }

    public EquipmentMaintenance(Integer subId, Integer equipmentId, String maintenanceRecord, Date maintenanceDate, String maintenancePerson, double maintenanceCost) {
        this.subId = subId;
        this.equipmentId = equipmentId;
        this.maintenanceRecord = maintenanceRecord;
        this.maintenanceDate = maintenanceDate;
        this.maintenancePerson = maintenancePerson;
        this.maintenanceCost = maintenanceCost;
    }

    /**
     * 获取
     * @return subId
     */
    public Integer getSubId() {
        return subId;
    }

    /**
     * 设置
     * @param subId
     */
    public void setSubId(Integer subId) {
        this.subId = subId;
    }

    /**
     * 获取
     * @return equipmentId
     */
    public Integer getEquipmentId() {
        return equipmentId;
    }

    /**
     * 设置
     * @param equipmentId
     */
    public void setEquipmentId(Integer equipmentId) {
        this.equipmentId = equipmentId;
    }

    /**
     * 获取
     * @return maintenanceRecord
     */
    public String getMaintenanceRecord() {
        return maintenanceRecord;
    }

    /**
     * 设置
     * @param maintenanceRecord
     */
    public void setMaintenanceRecord(String maintenanceRecord) {
        this.maintenanceRecord = maintenanceRecord;
    }

    /**
     * 获取
     * @return maintenanceDate
     */
    public Date getMaintenanceDate() {
        return maintenanceDate;
    }

    /**
     * 设置
     * @param maintenanceDate
     */
    public void setMaintenanceDate(Date maintenanceDate) {
        this.maintenanceDate = maintenanceDate;
    }

    /**
     * 获取
     * @return maintenancePerson
     */
    public String getMaintenancePerson() {
        return maintenancePerson;
    }

    /**
     * 设置
     * @param maintenancePerson
     */
    public void setMaintenancePerson(String maintenancePerson) {
        this.maintenancePerson = maintenancePerson;
    }

    /**
     * 获取
     * @return maintenanceCost
     */
    public double getMaintenanceCost() {
        return maintenanceCost;
    }

    /**
     * 设置
     * @param maintenanceCost
     */
    public void setMaintenanceCost(double maintenanceCost) {
        this.maintenanceCost = maintenanceCost;
    }

    public String toString() {
        return "EquipmentMaintenance{subId = " + subId + ", equipmentId = " + equipmentId + ", maintenanceRecord = " + maintenanceRecord + ", maintenanceDate = " + maintenanceDate + ", maintenancePerson = " + maintenancePerson + ", maintenanceCost = " + maintenanceCost + "}";
    }
}
