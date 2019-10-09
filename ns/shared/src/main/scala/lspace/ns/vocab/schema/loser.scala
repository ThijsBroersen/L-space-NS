package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object loser extends PropertyDef(
        iri = "http://schema.org/loser",
        iris = Set("http://schema.org/loser"),
        label = "loser",
        comment = """A sub property of participant. The loser of the action.""",
        `@extends` = List(participant.property),
        `@range` = List(Person.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.participant.Properties
}