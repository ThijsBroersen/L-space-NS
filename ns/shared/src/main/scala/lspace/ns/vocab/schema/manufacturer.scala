package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object manufacturer extends PropertyDef(
        iri = "http://schema.org/manufacturer",
        iris = Set("http://schema.org/manufacturer"),
        label = "manufacturer",
        comment = """The manufacturer of the product.""",
        `@extends` = () => List(),
        `@range` = () => List(Organization.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}