package com.CodeWithSharath.CertificationCourses.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//to pom.xml file and add the code of this link https://mvnrepository.com/artifact/org.mapstruct/mapstruct/1.5.5.Final
@Entity
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String code;
    private String instructor;
    private int durationInWeeks;
    private String description;
    private int creditHours;
    private String department;
    private String location;
    private boolean isActive;

}
