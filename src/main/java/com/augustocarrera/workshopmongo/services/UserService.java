package com.augustocarrera.workshopmongo.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.augustocarrera.workshopmongo.domain.User;
import com.augustocarrera.workshopmongo.dto.UserDTO;
import com.augustocarrera.workshopmongo.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }

    public User findById(UUID id) {
        return repo.findById(id).orElseThrow(() -> new com.augustocarrera.workshopmongo.exception.ObjectNotFoundException("User not found"));
    }

    public User insert(User obj){
        if (obj.getId() == null) {
            obj.setId(UUID.randomUUID());
        }
        return repo.insert(obj);
    }

    public void delete(UUID id) {
        findById(id);
        repo.deleteById(id);
    }

    public User update(User obj) {
        User newObj = findById(obj.getId());
        updateData(newObj, obj);
        return repo.save(newObj);
    }
    
    private void updateData(User newObj, User obj) {
        newObj.setName(obj.getName());
        newObj.setEmail(obj.getEmail());
    }

    public User fromDTO(UserDTO objDto) {
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }

}
