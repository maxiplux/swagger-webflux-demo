package com.example.swagger.webflux;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Data
@ToString
@Accessors(chain = true)
@EqualsAndHashCode(exclude = {"updateAt", "createdAt"})
public class Model {


    private String id;

    @LastModifiedDate
    private Date updateAt;

    @CreatedDate
    private Date createdAt;

}