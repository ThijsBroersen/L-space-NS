package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object material extends PropertyDef(
        iri = "http://schema.org/material",
        iris = Set("http://schema.org/material"),
        label = "material",
        comment = """A material that something is made from, e.g. leather, wool, cotton, paper.""",
        `@extends` = List(),
        `@range` = List(Product.ontology, `@string`, URL.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}