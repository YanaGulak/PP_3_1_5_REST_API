package ru.kata.spring.rest.demo.DAO;

import org.springframework.stereotype.Repository;
import ru.kata.spring.rest.demo.model.User;

import java.util.List;

@Repository
public interface UserRepository {

    List<User> findAll();

    User findUserById(Long id);

    User findByUsername(String username);

    void updateUser(User updateUser);

    void saveUser(User user);

    void deleteUserById(long id);
}


