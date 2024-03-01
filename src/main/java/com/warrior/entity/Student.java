package com.warrior.entity;


import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lqh
 * @since 2018-05-05
 */
@TableName("tb_student")
public class Student extends Model<Student> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	@TableField("stu_name")
	private String stuName;
	@TableField("stu_number")
	private String stuNumber;
	private Integer age;
	@TableField
	private Integer deleted; // 逻辑删除字段

	public Integer getId() {
		return id;
	}

	public Student setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getStuName() {
		return stuName;
	}

	public Student setStuName(String stuName) {
		this.stuName = stuName;
		return this;
	}

	public String getStuNumber() {
		return stuNumber;
	}

	public Student setStuNumber(String stuNumber) {
		this.stuNumber = stuNumber;
		return this;
	}

	public Integer getAge() {
		return age;
	}

	public Student setAge(Integer age) {
		this.age = age;
		return this;
	}

	public Integer getDeleted() {
		return deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
