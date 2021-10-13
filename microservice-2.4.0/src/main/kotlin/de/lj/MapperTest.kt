package de.lj

import de.lj.v240.dto.PersonDto
import de.lj.v240.entity.Person
import de.lj.v240.mapper.PersonMapper
import io.smallrye.mutiny.Uni
import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/test")
class MapperTest(
    @Inject val personMapper: PersonMapper
) {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun test(): Uni<PersonDto> = Uni.createFrom().item(personMapper.toPersonDto(Person(240, "Boris Dumbson")))
}
