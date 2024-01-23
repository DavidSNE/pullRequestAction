package com.gha.pullrequesttests;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PullRequestTestsApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void fail() {
        throw new RuntimeException("Failed");
    }

}
