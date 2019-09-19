package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object character extends PropertyDef(
        iri = "http://schema.org/character",
        iris = Set("http://schema.org/character"),
        label = "character",
        comment = """Fictional person connected with a creative work.""",
        `@extends` = () => List(),
        `@range` = () => List(Person.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}