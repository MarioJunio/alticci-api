package br.com.mj.alticci.resource;

import br.com.mj.alticci.domain.usecase.AlticciSequenceUsecase;
import org.eclipse.microprofile.openapi.annotations.enums.SchemaType;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.parameters.Parameter;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/alticci")
@Produces(MediaType.APPLICATION_JSON)
@Tag(name = "Alticci Sequence", description = "Generates the alticci sequence from number")
public class AlticciSequenceResource {

    @Inject
    private AlticciSequenceUsecase alticciSequenceUsecase;

    @GET
    @Path("/{n}")
    @APIResponse(
            responseCode = "200",
            description = "Generates the alticci sequence from number",
            content = @Content(
                    mediaType = MediaType.APPLICATION_JSON,
                    schema = @Schema(type = SchemaType.NUMBER, implementation = Long.class))
    )
    public Response getSequence(@Parameter(name = "n", required = true) @PathParam("n") Long number) {
        return Response.ok(alticciSequenceUsecase.call(number)).build();
    }
}
