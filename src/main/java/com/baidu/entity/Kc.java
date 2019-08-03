package com.baidu.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Dell on 2019/7/26.
 */
@Data
@Table(name = "t_kc")
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Kc {
    @Id
    @Column(name = "Id")
    private Long id;

    @Column(name = "cName")
    private String cName;

    @Column(name = "tName")
    private String tName;

    @Column(name = "price")
    private String price;

    @Column(name = "type")
    private String type;

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
