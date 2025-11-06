package dev.toon.format;

import dev.toon.format.decoder.ToonDecoder;
import dev.toon.format.encoder.ToonEncoder;

/**
 * Utility class for TOON encoding and decoding operations.
 */
public class ToonUtils {
    private static final ToonEncoder encoder = new ToonEncoder();
    private static final ToonDecoder decoder = new ToonDecoder();

    private ToonUtils() {
        // Utility class
    }

    /**
     * Encodes an object to TOON format.
     *
     * @param obj the object to encode
     * @return the TOON-formatted string
     */
    public static String toToon(Object obj) {
        return encoder.encode(obj);
    }

    /**
     * Decodes a TOON string to the specified type.
     *
     * @param toonString the TOON-formatted string
     * @param clazz the target class type
     * @param <T> the type parameter
     * @return the decoded object
     */
    public static <T> T fromToon(String toonString, Class<T> clazz) {
        return decoder.decode(toonString, clazz);
    }
}
