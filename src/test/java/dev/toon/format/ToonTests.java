package dev.toon.format;

import dev.toon.format.decoder.ToonDecoder;
import dev.toon.format.encoder.ToonEncoder;
import dev.toon.format.model.ToonNode;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for TOON encoder/decoder functionality.
 */
@SpringBootTest
class ToonTests {

    private final ToonEncoder encoder = new ToonEncoder();
    private final ToonDecoder decoder = new ToonDecoder();

    @Test
    void contextLoads() {
        assertNotNull(encoder);
        assertNotNull(decoder);
    }

    @Test
    void testEncodeSimpleObject() {
        // TODO: Implement test
        ToonNode node = new ToonNode();
        String result = encoder.encode(node);
        assertNotNull(result);
    }

    @Test
    void testDecodeSimpleString() {
        // TODO: Implement test
        String toonString = "";
        ToonNode result = decoder.decode(toonString);
        assertNotNull(result);
    }

    @Test
    void testRoundTrip() {
        // TODO: Implement round-trip test
    }
}
