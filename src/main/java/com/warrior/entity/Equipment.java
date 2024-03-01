package com.warrior.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@TableName("equipment")
@Data
public class Equipment {


    @TableId(value="equipment_id", type= IdType.AUTO)
    private Integer equipmentId;
    @TableField("name")
    private String name;
    @TableField("model")
    private String model;
    @TableField("serial_number")
    private String serialNumber;
    @TableField("purchase_date")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date purchaseDate;
    @TableField("status")
    private String status;
    @TableField("department")
    private String department;
    @TableField("responsible_person")
    private String responsiblePerson;
    @TableField("category")
    private String category;

    //子表
    @TableField(exist = false)
    private List<EquipmentMaintenance> equipmentMaintenances;


    public Equipment() {
    }

    public Equipment(Integer equipmentId, String name, String model, String serialNumber, Date purchaseDate, String status, String department, String responsiblePerson, String category) {
        this.equipmentId = equipmentId;
        this.name = name;
        this.model = model;
        this.serialNumber = serialNumber;
        this.purchaseDate = purchaseDate;
        this.status = status;
        this.department = department;
        this.responsiblePerson = responsiblePerson;
        this.category = category;
    }

    public Equipment(Integer equipmentId, String name, String model, String serialNumber, Date purchaseDate, String status, String department, String responsiblePerson, String category, List<EquipmentMaintenance> equipmentMaintenances) {
        this.equipmentId = equipmentId;
        this.name = name;
        this.model = model;
        this.serialNumber = serialNumber;
        this.purchaseDate = purchaseDate;
        this.status = status;
        this.department = department;
        this.responsiblePerson = responsiblePerson;
        this.category = category;
        this.equipmentMaintenances = equipmentMaintenances;
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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return model
     */
    public String getModel() {
        return model;
    }

    /**
     * 设置
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * 获取
     * @return serialNumber
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * 设置
     * @param serialNumber
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * 获取
     * @return purchaseDate
     */
    public Date getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * 设置
     * @param purchaseDate
     */
    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    /**
     * 获取
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取
     * @return department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * 设置
     * @param department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * 获取
     * @return responsiblePerson
     */
    public String getResponsiblePerson() {
        return responsiblePerson;
    }

    /**
     * 设置
     * @param responsiblePerson
     */
    public void setResponsiblePerson(String responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
    }

    /**
     * 获取
     * @return category
     */
    public String getCategory() {
        return category;
    }

    /**
     * 设置
     * @param category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    public String toString() {
        return "Equipment{equipmentId = " + equipmentId + ", name = " + name + ", model = " + model + ", serialNumber = " + serialNumber + ", purchaseDate = " + purchaseDate + ", status = " + status + ", department = " + department + ", responsiblePerson = " + responsiblePerson + ", category = " + category + "}";
    }

    /**
     * 获取
     * @return equipmentMaintenances
     */
    public List<EquipmentMaintenance> getEquipmentMaintenances() {
        return equipmentMaintenances;
    }

    /**
     * 设置
     * @param equipmentMaintenances
     */
    public void setEquipmentMaintenances(List<EquipmentMaintenance> equipmentMaintenances) {
        this.equipmentMaintenances = equipmentMaintenances;
    }
}
