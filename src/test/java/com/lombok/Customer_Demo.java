package com.lombok;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Customer_Demo {

    private String name;
    private int age;
    private String city;
    private boolean active;
    private String dob;

}
