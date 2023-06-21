package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramsTest {

    @Test
    void testAreAnagramsTrue() {
        assertTrue(Anagrams.areAnagrams("Coronavirus", "Carnivorous"));
        assertTrue(Anagrams.areAnagrams("A gentleman", "Elegant man"));
        assertTrue(Anagrams.areAnagrams("eleven plus two", "twelve plus one"));
        assertTrue(Anagrams.areAnagrams("Tom Marvolo Riddle", "I am Lord Voldemort"));
    }

    @Test
    void testAreAnagramsFalse() {
        assertFalse(Anagrams.areAnagrams("Anagram", "Anagramm"));
        assertFalse(Anagrams.areAnagrams("xx", "xxx"));
        assertFalse(Anagrams.areAnagrams("Test", "aTest"));
    }
}