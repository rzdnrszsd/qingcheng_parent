package com.qingcheng.pojo.goods;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author yangyonglong
 * @date 2020/3/7
 */
@Data
@Table(name = "tb_brand")
public class Brand implements Serializable {

    @Id
    private Integer id;

    private String name;

    private String image;

    private String letter;

    private Integer seq;
}
