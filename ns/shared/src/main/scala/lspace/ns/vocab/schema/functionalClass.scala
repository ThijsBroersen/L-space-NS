package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object functionalClass extends PropertyDef(
        iri = "http://schema.org/functionalClass",
        iris = Set("http://schema.org/functionalClass"),
        label = "functionalClass",
        comment = """The degree of mobility the joint allows.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology, MedicalEntity.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}