package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object winner extends PropertyDef(
        iri = "http://schema.org/winner",
        iris = Set("http://schema.org/winner"),
        label = "winner",
        comment = """A sub property of participant. The winner of the action.""",
        `@extends` = List(participant.property),
        `@range` = List(Person.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.participant.Properties
}