package com.greyson.projectboardadmin.dto;

import com.greyson.projectboardadmin.domain.UserAccount;
import com.greyson.projectboardadmin.domain.constant.RoleType;

import java.time.LocalDateTime;
import java.util.Set;

/**
 * DTO for {@link com.greyson.projectboardadmin.domain.UserAccount}
 */
public record UserAccountDto(
        String userId,
        String userPassword,
        Set<RoleType> roleTypes,
        String email,
        String nickname,
        String memo,
        LocalDateTime createdAt,
        String createdBy,
        LocalDateTime modifiedAt,
        String modifiedBy) {

    public static UserAccountDto of(String userId, String userPassword, Set<RoleType> roleTypes,
                                    String email, String nickname, String memo) {
        return UserAccountDto.of(userId, userPassword, roleTypes, email, nickname, memo, null, null, null, null);
    }

    public static UserAccountDto of(String userId, String userPassword, Set<RoleType> roleTypes,
                                    String email, String nickname, String memo, LocalDateTime createdAt, LocalDateTime modifiedAt,
                                    String createdBy, String modifiedBy) {
        return new UserAccountDto(userId, userPassword, roleTypes, email, nickname, memo, createdAt, createdBy, modifiedAt, modifiedBy);
    }

    public static UserAccountDto from(UserAccount entity) {
        return new UserAccountDto(
                entity.getUserId(),
                entity.getUserPassword(),
                entity.getRoleTypes(),
                entity.getEmail(),
                entity.getNickname(),
                entity.getMemo(),
                entity.getCreatedAt(),
                entity.getCreatedBy(),
                entity.getModifiedAt(),
                entity.getModifiedBy()
        );
    }

    public UserAccount toEntity() {
        return UserAccount.of(
                userId,
                userPassword,
                roleTypes,
                email,
                nickname,
                memo
        );
    }
}
