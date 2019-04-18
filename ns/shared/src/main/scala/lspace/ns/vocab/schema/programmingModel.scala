package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object programmingModel extends PropertyDef(
        iri = "http://schema.org/programmingModel",
        iris = Set("http://schema.org/programmingModel"),
        label = "programmingModel",
        comment = """Indicates whether API is managed or unmanaged.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}