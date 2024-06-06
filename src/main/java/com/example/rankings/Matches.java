package com.example.rankings;

import java.util.ArrayList;
import java.util.List;

public class Matches {
    private List<Match> matchList;

    public List<Match> getMatchList() {
        if (matchList == null) {
            matchList = new ArrayList<>();
        }
        return matchList;
    }
}
