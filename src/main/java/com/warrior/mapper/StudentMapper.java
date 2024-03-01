package com.warrior.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.warrior.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author lqh
 * @since 2018-05-05
 */
@Mapper
public interface StudentMapper extends BaseMapper<Student> {
    @Select("selectStudentByStuName")
    List<Student> selectStudentByStuName(String stuName);

}