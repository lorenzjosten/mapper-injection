package de.lj

import de.lj.v230.dto.PersonDto
import de.lj.v230.entity.Person
import de.lj.v230.mapper.PersonMapper
import io.smallrye.mutiny.Uni
import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/test")
class MapperTest(
    private val personMapper: PersonMapper
) {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun test(): Uni<PersonDto> = Uni.createFrom().item(personMapper.toPersonDto(Person(230, "Tronald Dumb")))
}
