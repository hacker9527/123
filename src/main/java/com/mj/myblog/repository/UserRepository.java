package com.mj.myblog.repository;

import com.mj.myblog.enity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
}
