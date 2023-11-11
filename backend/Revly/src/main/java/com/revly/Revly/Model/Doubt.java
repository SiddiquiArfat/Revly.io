package com.revly.Revly.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doubt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String doubt;

    String subject;
    String language;
    String grade;

    @ManyToOne
    Users user;

    @ManyToOne
    TutorAvailability tutorAvailability;
}
