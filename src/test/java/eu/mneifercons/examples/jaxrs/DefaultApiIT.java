package eu.mneifercons.examples.jaxrs;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import eu.mneifercons.examples.jaxrs.api.DefaultApi;
import eu.mneifercons.examples.jaxrs.model.Verb;
import org.apache.cxf.jaxrs.client.Client;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;


/**
 * Verbs Service
 *
 * <p>No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 * <p>
 * API tests for DefaultApi
 */
public class DefaultApiIT {

    private DefaultApi api;

    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List<JacksonJsonProvider> providers = new ArrayList<>();
        providers.add(provider);

        api = JAXRSClientFactory.create("http://localhost:8080/v1", DefaultApi.class, providers);
        Client client = WebClient.client(api);

        ClientConfiguration config = WebClient.getConfig(client);
    }

    /**
     * Add a new Verb
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addVerbTest() {
        // Arrange
        Verb body = new Verb();
        body.setName("trabajar");
        body.setFirst("trabajo");
        body.setSecond("trabajas");
        body.setThird("trabaja");
        body.setFirsts("trabajamos");
        body.setSeconds("trabajáis");
        body.setThirds("trabajan");

        // Act
        api.addVerb(body);

        // TODO: assert
    }

    /**
     * Delete verb by name
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteVerbTest() {
        // Arrange
        String name = "trabajar";

        // Act
        api.deleteVerb(name);

        // TODO: assert
    }

    /**
     * Get verb by name
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getVerbByNameTest() {
        // Arrange
        String name = "trabajar";

        // Act
        Verb response = api.getVerbByName(name);

        // TODO: assert
        assertNotNull(response);
    }

    /**
     * Get verbs
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getVerbsTest() {
        // Arrange, act
        List<Verb> response = api.getVerbs();

        // TODO: assert
        assertNotNull(response);
    }

    /**
     * Update verb by name
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateVerbTest() {
        // Arrange
        Verb body = new Verb();
        body.setName("trabajar");
        body.setFirst("trabajo");
        body.setSecond("trabajas");
        body.setThird("trabaja");
        body.setFirsts("trabajamos");
        body.setSeconds("trabajáis");
        body.setThirds("trabajan");
        String name = "trabajar";

        // Act
        api.updateVerb(body, name);

        // TODO: assert
    }
}
