package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object linkRelationship extends PropertyDef(
        iri = "http://schema.org/linkRelationship",
        iris = Set("http://schema.org/linkRelationship"),
        label = "linkRelationship",
        comment = """Indicates the relationship type of a Web link.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}