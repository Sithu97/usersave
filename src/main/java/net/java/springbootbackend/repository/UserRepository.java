package net.java.springbootbackend.repository;

import net.java.springbootbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository <User , Long>{
User findUserByFirstName(String fname);

}
