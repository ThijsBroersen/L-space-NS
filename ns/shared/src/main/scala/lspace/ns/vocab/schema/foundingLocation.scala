package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object foundingLocation extends PropertyDef(
        iri = "http://schema.org/foundingLocation",
        iris = Set("http://schema.org/foundingLocation"),
        label = "foundingLocation",
        comment = """The place where the Organization was founded.""",
        `@extends` = List(),
        `@range` = List(Place.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}