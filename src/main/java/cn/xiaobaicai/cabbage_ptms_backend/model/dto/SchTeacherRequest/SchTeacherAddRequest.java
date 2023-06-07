package cn.xiaobaicai.cabbage_ptms_backend.model.dto.SchTeacherRequest;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 添加老师信息请求
 *
 * @author hetongxue
 */
@Data
public class SchTeacherAddRequest implements Serializable {

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private Byte gender;

    /**
     * 工号
     */
    private String workId;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 院系
     */
    private String faculty;

}
