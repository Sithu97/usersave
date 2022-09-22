package net.java.springbootbackend.controller;


import net.java.springbootbackend.exception.ResourceNotFoundException;
import net.java.springbootbackend.model.User;
import net.java.springbootbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    //get users rest api
    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    //  create employee REST API
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }


    // build get employee by id REST API
    @GetMapping("{id}")
    public ResponseEntity<User> getEmployeeById(@PathVariable long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id:" + id));
        return ResponseEntity.ok(user);
    }

    // build update employee REST API
    @PutMapping("{id}")
    public ResponseEntity<User> updateEmployee(@PathVariable long id, @RequestBody User userDetails) {
        User updateEmployee = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id: " + id));

        updateEmployee.setFirstName(userDetails.getFirstName());
        updateEmployee.setLastName(userDetails.getLastName());
        updateEmployee.setEmailId(userDetails.getEmailId());

        userRepository.save(updateEmployee);

        return ResponseEntity.ok(updateEmployee);
    }

    // build delete employee REST API
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable long id) {

        User employee = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with  id: " + id));

        userRepository.delete(employee);

        return new ResponseEntity<>(HttpStatus.OK);

    }
}