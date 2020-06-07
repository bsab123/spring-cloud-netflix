package org.caps.provider.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "user")
public class User implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "password")
    private String password;

    @TableField(value = "acount")
    private String acount;

    @TableField(value = "name")
    private String name;

    @TableField(value = "avatar")
    private String avatar;

    @TableField(value = "gender")
    private String gender;

    @TableField(value = "address")
    private String address;

    @TableField(value = "room_id")
    private Integer roomId;

    private Room room;

    private static final long serialVersionUID = 1L;
}