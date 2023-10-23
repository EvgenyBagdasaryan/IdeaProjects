package org.example.optional;

import java.util.Optional;
import org.junit.Test;
import static org.junit.Assert.*;

public class OptionalUse {

    @Test
    public void OptionalEmpty(){

        Optional<String> empty = Optional.empty();
        assertFalse(empty.isPresent());
    }

    @Test
    public void givenNonNull_whenCreatesNonNullable_thenCorrect() {
        String name = "Wine";
        Optional<String> opt = Optional.of(name);
        assertTrue(opt.isPresent());
    }

    @Test
    public void whenOrElseWorks_thenCorrect() {
        String nullName = null;
        String name = Optional.ofNullable(nullName).orElse("Boris");
        assertEquals("Boris", name);
    }
}
