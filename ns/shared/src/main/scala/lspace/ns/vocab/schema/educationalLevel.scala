package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object educationalLevel extends PropertyDef(
        iri = "http://schema.org/educationalLevel",
        iris = Set("http://schema.org/educationalLevel"),
        label = "educationalLevel",
        comment = """The level in terms of progression through an educational or training context. Examples of educational levels include 'beginner', 'intermediate' or 'advanced', and formal sets of level indicators.""",
        `@extends` = List(),
        `@range` = List(`@string`, DefinedTerm.ontology, URL.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}