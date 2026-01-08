package br.dev.tioback.codility.commons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IOUtilsTest {

    @Test
    void resourceShouldReturnNullWhenMissing() {
        assertNull(IOUtils.resourceAsString("/no-such-resource.txt"));
    }
}
