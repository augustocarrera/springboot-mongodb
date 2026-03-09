package com.augustocarrera.workshopmongo.dto;

import java.io.Serializable;
import java.util.UUID;

import com.augustocarrera.workshopmongo.domain.User;

public class AuthorDTO implements Serializable {

        private UUID id;
        private String name;

        public AuthorDTO() {           
        }

        public AuthorDTO(User obj){
            id = obj.getId();
            name = obj.getName();
        }

        public UUID getId() {
            return id;
        }

        public void setId(UUID id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
}
