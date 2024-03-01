package com.warrior.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.warrior.entity.Student;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lqh
 * @since 2018-05-05
 */
public interface IStudentService extends IService<Student> {
	List<Student> selectStudentByStuName(String student);
}
