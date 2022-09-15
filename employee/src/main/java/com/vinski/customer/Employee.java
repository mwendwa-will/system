package com.vinski.customer;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {

    private Integer id;
    private String fisrtName;
    private String secondName;
    private String email;
}
