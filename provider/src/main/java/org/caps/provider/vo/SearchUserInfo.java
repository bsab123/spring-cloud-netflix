package org.caps.provider.vo;


import lombok.Data;
import org.caps.provider.domain.Room;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
@Document(indexName = "user", type = "user", shards = 1, replicas = 0, refreshInterval = "-1")
@Data
public class SearchUserInfo implements Serializable {
    @Id
    private Integer id;

    private String password;

    private String acount;

    private String name;

    private String avatar;

    private String gender;

    private String address;

    private double hotScore;

    private Room room;
}
