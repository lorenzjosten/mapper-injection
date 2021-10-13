package de.lj.v240.mapper

import de.lj.v240.dto.PersonDto
import de.lj.v240.entity.Person
import org.mapstruct.InjectionStrategy
import org.mapstruct.Mapper

@Mapper(componentModel = "cdi", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
interface PersonMapper {
    fun toPersonDto(person: Person): PersonDto

    fun toPerson(personDto: PersonDto): Person
}