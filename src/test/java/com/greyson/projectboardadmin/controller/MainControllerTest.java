package com.greyson.projectboardadmin.controller;

import com.greyson.projectboardadmin.config.GlobalControllerConfig;
import com.greyson.projectboardadmin.config.TestSecurityConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@DisplayName("View 루트 컨트롤러")
@Import({TestSecurityConfig.class, GlobalControllerConfig.class})
@WebMvcTest(MainController.class)
class MainControllerTest {

    private final MockMvc mvc;

    public MainControllerTest(@Autowired MockMvc mvc) {
        this.mvc = mvc;
    }
    @WithMockUser(username = "tester", roles = "USER")
    @DisplayName("[view][GET] 루트페이지 -> 게시글 관리 페이지 Forwarding")
    @Test
    void givenNothing_whenRequestingRootView_thenForwardsToArticleManagementView() throws Exception {
        // Given

        // When & Then
        mvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("forward:/management/articles"))
                .andExpect(forwardedUrl("/management/articles"));
    }
}
