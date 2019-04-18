package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object source extends PropertyDef(
        iri = "http://schema.org/source",
        iris = Set("http://schema.org/source"),
        label = "source",
        comment = """The anatomical or organ system that the artery originates from.""",
        `@extends` = () => List(),
        `@range` = () => List(AnatomicalStructure.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}