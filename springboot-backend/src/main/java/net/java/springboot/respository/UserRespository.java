package net.java.springboot.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.java.springboot.module.User;


@Repository
public interface UserRespository extends JpaRepository<User,Long> {

}
