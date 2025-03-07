package com.greyson.projectboardadmin.repository;

import com.greyson.projectboardadmin.domain.AdminAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminAccountRepository extends JpaRepository<AdminAccount, String> {
}
