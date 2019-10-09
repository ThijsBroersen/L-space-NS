package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object medicalSpecialty extends PropertyDef(
        iri = "http://schema.org/medicalSpecialty",
        iris = Set("http://schema.org/medicalSpecialty"),
        label = "medicalSpecialty",
        comment = """A medical specialty of the provider.""",
        `@extends` = List(),
        `@range` = List(MedicalSpecialty.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}