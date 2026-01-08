package br.dev.tioback.codility.commons;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

public final class IOUtils {

    private IOUtils() {}

    public static String resourceAsString(String resourcePath) {
        InputStream is = IOUtils.class.getResourceAsStream(resourcePath);
        if (is == null) return null;
        try (BufferedReader r = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))) {
            return r.lines().collect(Collectors.joining(System.lineSeparator()));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
