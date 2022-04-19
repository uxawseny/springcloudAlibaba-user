package alexft.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String phone;

    private String pwd;

    private Integer sex;

    private String img;

    private Date createTime;

    /**
     * 1是普通用户，2是管理员
     */
    private Integer role;

    private String username;

    private String wechat;


}
