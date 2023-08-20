package com.note01.po;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class TbNote {

  private Integer noteId;
  private String title;
  private String content;
  private Integer typeId;
  private Date pubTime;
  private Float lon;
  private Float lat;

  private String typeName;
}
