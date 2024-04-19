package club.snow.ihome.bean.domain;

import club.snow.ihome.bean.domain.base.IHomeBaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;


/**
 * The type User login do.
 *
 * @author <a href="mailto:pengdahai216@126.com">pengdahai</a>
 * @since 2024 /04/18
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserLoginDO extends IHomeBaseDO {

    private static final long serialVersionUID = 1L;
    /**
     * 用户名
     */
    private String userName;

    /**
     * 是否注销 0正常 1注销 默认0
     */
    private Boolean isActive;

    /**
     * 用户类型（00系统用户 01注册用户）
     */
    private String userType;

    /**
     * 密码
     */
    private String password;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 盐值
     */
    private String salt;

    /**
     * 最近登录时间
     */
    private Date loginDate;

    /**
     * 最后登录IP
     */
    private String loginIp;

    /**
     * 密码最后更新时间
     */
    private Date pwdUpdateDate;
}