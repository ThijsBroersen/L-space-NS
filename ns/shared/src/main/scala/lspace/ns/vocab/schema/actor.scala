package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object actor extends PropertyDef(
        iri = "http://schema.org/actor",
        iris = Set("http://schema.org/actor"),
        label = "actor",
        comment = """An actor, e.g. in tv, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip.""",
        `@extends` = List(),
        `@range` = List(Person.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}