package ru.itis.javalab.repositories;

import ru.itis.javalab.models.User;

import java.util.List;

/**
 * 05.10.2020
 * 08. Web Application
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface UsersRepository extends CrudRepository<User> {
    List<User> findAllByAge(int age);
}
