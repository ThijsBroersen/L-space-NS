package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object applicantLocationRequirements extends PropertyDef(
        iri = "http://schema.org/applicantLocationRequirements",
        iris = Set("http://schema.org/applicantLocationRequirements"),
        label = "applicantLocationRequirements",
        comment = """The location(s) applicants can apply from. This is usually used for telecommuting jobs where the applicant does not need to be in a physical office. Note: This should not be used for citizenship or work visa requirements.""",
        `@extends` = () => List(),
        `@range` = () => List(AdministrativeArea.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}