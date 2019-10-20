package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object isBasedOnUrl extends PropertyDef(
        iri = "http://schema.org/isBasedOnUrl",
        iris = Set("http://schema.org/isBasedOnUrl"),
        label = "isBasedOnUrl",
        comment = """A resource that was used in the creation of this resource. This term can be repeated for multiple sources. For example, http://example.com/great-multiplication-intro.html.""",
        `@extends` = List(),
        `@range` = List(URL.ontology, Product.ontology, CreativeWork.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}