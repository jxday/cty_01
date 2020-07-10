package com.jxday.modules.codereview.entity;

import lombok.*;
import lombok.experimental.Accessors;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName People
 * @create 2020-01-13 15:12
 * @Version 1.0.0
 */
@Accessors(chain = true)
@Setter
@Getter
@RequiredArgsConstructor(staticName = "ofName")
@EqualsAndHashCode
@ToString
public class People {
    @NonNull
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
