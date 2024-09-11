package com.rabbiter.hospital.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rabbiter.hospital.pojo.Patient;
import org.apache.ibatis.annotations.Param;

public interface PatientMapper extends BaseMapper<Patient> {
    /**
     * 统计患者男女人数
     */
    Integer patientAge(@Param("startAge") int startAge, @Param("endAge") int endAge);
}
