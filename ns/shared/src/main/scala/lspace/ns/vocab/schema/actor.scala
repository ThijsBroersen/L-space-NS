package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object actor extends PropertyDef(
        iri = "https://schema.org/actor",
        iris = Set("https://schema.org/actor"),
        label = "actor",
        comment = """An actor, e.g. in tv, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip.""",
        `@extends` = () => List(),
        `@range` = () => List(Person.ontology)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}