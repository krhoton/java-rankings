package com.example.rankings;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class DirectTest {

    @Test
    public void matchesDirectlyReturnsMatchlist() {
        // Arrange
        MatchesDAO matchesDao = new MatchesDAO();
        MatchesController matchesController = new MatchesController(matchesDao);

        // Act
        List<Match> result = matchesController.GetMatches().getMatchList();

        // Assert
        assertIterableEquals(
                matchesDao.getAllMatches().getMatchList(),
                result);

    }
}
