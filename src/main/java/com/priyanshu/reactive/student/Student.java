package com.priyanshu.reactive.student;

import lombok.*;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "students")
public class Student {
    private Integer id ;
    private String firstName ;

    private String LastName ;

    private Integer age;
}
