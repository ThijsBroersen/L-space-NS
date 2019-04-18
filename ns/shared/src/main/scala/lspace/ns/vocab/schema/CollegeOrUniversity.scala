package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object CollegeOrUniversity extends OntologyDef(
        iri = "http://schema.org/CollegeOrUniversity",
        iris = Set("http://schema.org/CollegeOrUniversity"),
        label = "CollegeOrUniversity",
        comment = """A college, university, or other third-level educational institution.""",
        `@extends` = () => List(EducationalOrganization.ontology)
       ){
object keys extends lspace.ns.vocab.schema.EducationalOrganization.Properties{

override lazy val alumni = lspace.ns.vocab.schema.alumni.property}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.EducationalOrganization.Properties{

override lazy val alumni = lspace.ns.vocab.schema.alumni.property}
}