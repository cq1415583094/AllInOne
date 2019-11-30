package com.hz;

import java.util.HashMap;
import java.util.Map;

public class MyCharacterFactory {
    private Map<Character, MyCharacter> pool;

    public MyCharacterFactory() {
        pool = new HashMap<>();
    }

    public MyCharacter getMyCharacter(char character) {
        MyCharacter myCharacter = pool.get(character);
        if (myCharacter == null) {
            myCharacter = new MyCharacter(character);
            pool.put(character, myCharacter);
        }
        return myCharacter;
    }
}