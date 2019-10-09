package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object validIn extends PropertyDef(
        iri = "http://schema.org/validIn",
        iris = Set("http://schema.org/validIn"),
        label = "validIn",
        comment = """The geographic area where a permit or similar thing is valid.""",
        `@extends` = List(),
        `@range` = List(AdministrativeArea.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}