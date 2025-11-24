package com.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.Entity.Profile;

public interface ProfileRepository extends JpaRepository<Profile,Long> {

}
