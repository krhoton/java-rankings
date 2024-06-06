package com.example.rankings;

import org.springframework.stereotype.Repository;

@Repository
public class MatchesDAO {
    private static Matches list = new Matches();

    static {
        list.getMatchList().add(
                new Match(
                        "Mr. Potato Head",
                        "Woody",
                        10,
                        0
                ));
    }

    public Matches getAllMatches() {
        return list;
    }
}
