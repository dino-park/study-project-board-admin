package com.greyson.projectboardadmin.repository;

import com.greyson.projectboardadmin.domain.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends JpaRepository<UserAccount, String> {
}
