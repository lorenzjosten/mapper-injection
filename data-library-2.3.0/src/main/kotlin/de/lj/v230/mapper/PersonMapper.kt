package de.lj.v230.mapper

import de.lj.v230.dto.PersonDto
import de.lj.v230.entity.Person
import org.mapstruct.InjectionStrategy
import org.mapstruct.Mapper

@Mapper(componentModel = "cdi", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
interface PersonMapper {
    fun toPersonDto(person: Person): PersonDto

    fun toPerson(personDto: PersonDto): Person
}