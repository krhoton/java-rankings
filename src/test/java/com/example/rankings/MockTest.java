package com.example.rankings;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class MockTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void mockMatchesShouldReturnMatchlist() throws Exception {
        this.mockMvc.perform(get("/matches"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json("{'matchList': [{\"player1\":\"Mr. Potato Head\",\"player2\":\"Woody\",\"score1\":10,\"score2\":0}]}"));
    }
}
