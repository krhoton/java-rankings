package com.example.rankings;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HttpTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private MatchesDAO matchesDAO;

    @Test
    public void matchesReturnsMatchList() {
        assertIterableEquals(
                matchesDAO.getAllMatches().getMatchList(),
                this.restTemplate.getForObject("http://localhost:" + port + "/matches",Matches.class)
                        .getMatchList());
    }
}
