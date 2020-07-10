package com.jxday.modules.codereview.entity;

import com.jxday.modules.codereview.Interface.Ireview;
import org.apache.commons.beanutils.BeanUtils;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName PeopleDTO
 * @create 2020-01-13 15:13
 * @Version 1.0.0
 */
public class PeopleDTO {
    private String name;
    private Integer age;
    private Long number;

    public PeopleDTO() {
    }

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

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

//    private People convertToPeople() throws Exception {
//        PeopleInutDTOConvert convert = new PeopleInutDTOConvert();
//        People people = convert.convert(this);
//        return people;
//    }
//    
//    private static class PeopleInutDTOConvert implements Ireview<PeopleDTO,People>{
//        @Override
//        public People convert(PeopleDTO peopleDTO) throws Exception{
//            People people = new People();
//            BeanUtils.copyProperties(peopleDTO,people);
//            return people;
//        }
//    }
    
}
