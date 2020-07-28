package com.test.java.entity;

import java.util.Objects;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName PersonDTO
 * @create 2020-07-28 15:44
 * @Version 1.0.0
 */
public class PersonDTO extends Person {
    private Boolean isDeadth;

    public Boolean getDeadth() {
        return isDeadth;
    }

    public void setDeadth(Boolean deadth) {
        isDeadth = deadth;
    }

    @Override
    public boolean equals(Object obj) {
        if ((Person)this == obj) return true;
        if (!(obj instanceof Person)) return false;
        if (obj instanceof Person) {
            Person person = (Person) obj;
            return person.getAge() == this.getAge() && person.getName() == this.getName();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getName());
    }
}
