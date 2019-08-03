package com.baidu.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Dell on 2019/7/26.
 */
@Data
@Table(name = "t_Ck")
public class Ck {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "zjh")
    private String  zjh;

    @Column(name = "zName")
    private String zName;

    @Column(name = "sukc")
    private String sukc;

    @Column(name = "createTime")
    @CreatedDate
    private Date createTime;
    @Transient
    private String createDate;
    public String getCreateDate(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月DD日");
        String format =null;
        if (createTime!=null){
            simpleDateFormat.format(createTime);

        }
        return format;
    }
}
