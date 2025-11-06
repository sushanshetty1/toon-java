package dev.toon.format.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.Map;
import java.util.List;

/**
 * Represents a node in the TOON format structure.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ToonNode {
    private String type;
    private Object value;
    private Map<String, Object> attributes;
    private List<ToonNode> children;
}
