package hu.sample.generator;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SchemaGeneratorTest {

    private SchemaGenerator schemaGenerator;

    @Before
    public void setUp() {
        this.schemaGenerator = new SchemaGenerator();
    }

    @Test
    public void testSchemaGeneration() throws JsonProcessingException {
        String expected = "{\"$schema\":\"http://json-schema.org/draft-04/schema#\",\"title\":\"Invoice\",\"type\":\"object\",\"additionalProperties\":false,\"properties\":{\"id\":{\"type\":\"integer\"},\"amount\":{\"type\":\"integer\",\"minimum\":1000},\"user\":{\"$ref\":\"#/definitions/User\"}},\"required\":[\"id\",\"user\"],\"definitions\":{\"User\":{\"type\":\"object\",\"additionalProperties\":false,\"properties\":{\"id\":{\"type\":\"integer\"},\"name\":{\"type\":\"string\"},\"age\":{\"type\":\"integer\"},\"welcomeMessage\":{\"type\":\"string\",\"pattern\":\"[A-Z].\"}},\"required\":[\"id\",\"name\"]}}}";
        String result = this.schemaGenerator.generateSchema();
        Assert.assertEquals(expected, result);
    }
}
