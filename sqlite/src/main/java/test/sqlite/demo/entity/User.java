package test.sqlite.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author ZhiXiang
 * @create 2020/2/25 15:56
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer id;

    private String name;

    private String pwd;
}
