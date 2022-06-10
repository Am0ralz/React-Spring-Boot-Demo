package com.example.fullstack_spring_react.student;

import lombok.*;

@ToString
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
//This replaces all of the above but makes it Final
//@Data
public class Student {
    private Long id;
    private String name;
    private String email;
    private Gender gender;
}
