package com.mingati.kikundi.repository;

import com.mingati.kikundi.base.UserBo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserBo,Long> {

}
