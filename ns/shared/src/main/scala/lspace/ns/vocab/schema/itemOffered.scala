package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object itemOffered extends PropertyDef(
        iri = "http://schema.org/itemOffered",
        iris = Set("http://schema.org/itemOffered"),
        label = "itemOffered",
        comment = """The item being offered.""",
        `@extends` = List(),
        `@range` = List(Service.ontology, Product.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}