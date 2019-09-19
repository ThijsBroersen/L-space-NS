package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object educationalAlignment extends PropertyDef(
        iri = "http://schema.org/educationalAlignment",
        iris = Set("http://schema.org/educationalAlignment"),
        label = "educationalAlignment",
        comment = """An alignment to an established educational framework.""",
        `@extends` = () => List(),
        `@range` = () => List(AlignmentObject.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}