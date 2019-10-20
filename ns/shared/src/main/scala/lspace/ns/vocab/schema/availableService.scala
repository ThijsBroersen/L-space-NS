package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object availableService extends PropertyDef(
        iri = "http://schema.org/availableService",
        iris = Set("http://schema.org/availableService"),
        label = "availableService",
        comment = """A medical service available from this provider.""",
        `@extends` = List(),
        `@range` = List(MedicalTest.ontology, MedicalProcedure.ontology, MedicalTherapy.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}