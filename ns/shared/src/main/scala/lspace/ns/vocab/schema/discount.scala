package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object discount extends PropertyDef(
        iri = "http://schema.org/discount",
        iris = Set("http://schema.org/discount"),
        label = "discount",
        comment = """Any discount applied (to an Order).""",
        `@extends` = () => List(),
        `@range` = () => List(`@number`, Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}