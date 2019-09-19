package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object targetProduct extends PropertyDef(
        iri = "http://schema.org/targetProduct",
        iris = Set("http://schema.org/targetProduct"),
        label = "targetProduct",
        comment = """Target Operating System / Product to which the code applies.  If applies to several versions, just the product name can be used.""",
        `@extends` = () => List(),
        `@range` = () => List(SoftwareApplication.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}