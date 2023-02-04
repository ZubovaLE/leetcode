package org.nikiforova.solutions.easy.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class FirstUniqueCharacterTest {

    @ParameterizedTest
    @CsvSource(value = {"leetcode, 0", "loveleetcode, 2", "aabb, -1"})
    @DisplayName("Test firstUniqChar with different parameters")
    void testFirstUniqChar(String s, int expected) {
        assertEquals(expected, FirstUniqueCharacter.firstUniqChar(s));
    }
}