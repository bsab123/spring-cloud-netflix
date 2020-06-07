package org.caps.provider.domain;

import com.baomidou.mybatisplus.annotation.TableField;
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
@TableName(value = "room")
public class Room implements Serializable {
    @TableField(value = "id")
    private Integer id;

    @TableField(value = "roomNumber")
    private Integer roomnumber;

    @TableField(value = "bName")
    private String bname;

    @TableField(value = "time")
    private String time;

    @TableField(value = "status")
    private String status;

    private static final long serialVersionUID = 1L;
}