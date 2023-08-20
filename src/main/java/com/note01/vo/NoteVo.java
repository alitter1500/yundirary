package com.note01.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class NoteVo implements Serializable{
    private static final long serialVersionUID = 4390482518182625971L;
    private String groupName; //分组名称
    private long noteCount;//云记数量

    private Integer typeId;  // 类型ID
}
