package com.greyson.projectboardadmin.dto;

import com.greyson.projectboardadmin.domain.AdminAccount;

import java.time.LocalDateTime;

/**
 * DTO for {@link AdminAccount}
 */
public record UserAccountDto(
        String userId,
        String email,
        String nickname,
        String memo,
        LocalDateTime createdAt,
        String createdBy,
        LocalDateTime modifiedAt,
        String modifiedBy) {

    public static UserAccountDto of(String userId, String email, String nickname, String memo) {
        return UserAccountDto.of(userId, email, nickname, memo, null, null, null, null);
    }

    public static UserAccountDto of(String userId, String email, String nickname, String memo, LocalDateTime createdAt, LocalDateTime modifiedAt,
                                    String createdBy, String modifiedBy) {
        return new UserAccountDto(userId, email, nickname, memo, createdAt, createdBy, modifiedAt, modifiedBy);
    }
}
