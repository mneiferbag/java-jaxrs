package eu.mneifercons.examples.jaxrs.api;

import eu.mneifercons.examples.jaxrs.model.Verb;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import javax.validation.Valid;
import javax.ws.rs.*;
import java.util.List;

/**
 * Verbs Service
 *
 * <p>No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 */
@Path("/")
public interface DefaultApi  {

    /**
     * Add a new Verb
     *
     */
    @POST
    @Path("/verb")
    @Consumes({ "application/json" })
    @Operation(summary = "Add a new Verb", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful operation"),
        @ApiResponse(responseCode = "405", description = "Invalid input") })
    public void addVerb(@Valid Verb body);

    /**
     * Delete verb by name
     *
     */
    @DELETE
    @Path("/verb/{name}")
    @Operation(summary = "Delete verb by name", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful operation"),
        @ApiResponse(responseCode = "400", description = "Invalid parameter value"),
        @ApiResponse(responseCode = "404", description = "Verb not found") })
    public void deleteVerb(@PathParam("name") String name);

    /**
     * Get verb by name
     *
     */
    @GET
    @Path("/verb/{name}")
    @Produces({ "application/json" })
    @Operation(summary = "Get verb by name", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Verb.class))),
        @ApiResponse(responseCode = "400", description = "Invalid parameter value") })
    public Verb getVerbByName(@PathParam("name") String name);

    /**
     * Get verbs
     *
     */
    @GET
    @Path("/verb")
    @Produces({ "application/json" })
    @Operation(summary = "Get verbs", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Verb.class)))) })
    public List<Verb> getVerbs();

    /**
     * Update verb by name
     *
     */
    @PUT
    @Path("/verb/{name}")
    @Consumes({ "application/json" })
    @Operation(summary = "Update verb by name", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful operation"),
        @ApiResponse(responseCode = "400", description = "Invalid parameter value"),
        @ApiResponse(responseCode = "404", description = "Verb not found") })
    public void updateVerb(@Valid Verb body, @PathParam("name") String name);
}
