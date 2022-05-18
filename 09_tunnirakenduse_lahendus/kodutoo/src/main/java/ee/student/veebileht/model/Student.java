package src.main.java.ee.student.veebileht.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Student {
    @Id
    @GeneratedValue
    Long id;
    String name;
    double stdntcode;
    String imgSrc;
    String description;
    boolean active;

    // @OneToOne @ManyToOne @OneToMany @ManyToMany
    // Category category;
}
