//package com.jrp.pma.entities;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class Task {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private long taskId;
//    private String name;
//    private String stage;
//    private String description;
//
//    @OneToMany(mappedBy="theTask")  //one project can have many employees
//    private List<Employee> employees;
//}