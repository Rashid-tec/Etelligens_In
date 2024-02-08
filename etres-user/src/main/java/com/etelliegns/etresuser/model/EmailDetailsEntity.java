package com.etelliegns.etresuser.model;

import jakarta.persistence.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EmailDetailsEntity {



    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String recipient;
        private String msgBody;
        private String subject;
        private String attachment;













    }


