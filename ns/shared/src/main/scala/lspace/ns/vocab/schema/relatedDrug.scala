package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object relatedDrug extends PropertyDef(
        iri = "http://schema.org/relatedDrug",
        iris = Set("http://schema.org/relatedDrug"),
        label = "relatedDrug",
        comment = """Any other drug related to this one, for example commonly-prescribed alternatives.""",
        `@extends` = () => List(),
        `@range` = () => List(Drug.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}