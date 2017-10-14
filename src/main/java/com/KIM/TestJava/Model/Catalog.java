package com.KIM.TestJava.Model;

import java.util.HashMap;

public class Catalog {
    private HashMap<String, Cd> cds;

    public HashMap<String, Cd> getCds() {
        return cds;
    }

    public void setCds(HashMap<String, Cd> cds) {
        this.cds = cds;
    }

    public Cd getCd(String key) {
        return cds.get(key);
    }
}
