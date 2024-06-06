package com.example.rankings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MatchesController {

    @Autowired
    private MatchesDAO matchesDao;

    @GetMapping(path = "/matches", produces = "application/json")
    public Matches GetMatches() {
        return matchesDao.getAllMatches();
    }
}
