package dev.ayush.productservice.inheritancedemo.joinedtable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("jt_userRepo")
public interface UserRepository extends JpaRepository<User, Long> {
    @Override
    <S extends User> S save(S entity);
}
