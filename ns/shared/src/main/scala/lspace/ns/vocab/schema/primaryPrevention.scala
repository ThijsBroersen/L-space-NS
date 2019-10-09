package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object primaryPrevention extends PropertyDef(
        iri = "http://schema.org/primaryPrevention",
        iris = Set("http://schema.org/primaryPrevention"),
        label = "primaryPrevention",
        comment = """A preventative therapy used to prevent an initial occurrence of the medical condition, such as vaccination.""",
        `@extends` = List(),
        `@range` = List(MedicalTherapy.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}