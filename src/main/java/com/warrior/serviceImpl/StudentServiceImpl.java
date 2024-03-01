package com.warrior.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.warrior.entity.Student;
import com.warrior.mapper.StudentMapper;
import com.warrior.service.IStudentService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author lqh
 * @since 2018-05-05
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {


    @Override
    public List<Student> selectStudentByStuName(String Student) {
        return this.baseMapper.selectStudentByStuName(Student);
    }
}
