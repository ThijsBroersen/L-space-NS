package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Preschool extends OntologyDef(
        iri = "http://schema.org/Preschool",
        iris = Set("http://schema.org/Preschool"),
        label = "Preschool",
        comment = """A preschool.""",
        `@extends` = List(EducationalOrganization.ontology)
       ){
object keys extends lspace.ns.vocab.schema.EducationalOrganization.Properties{

override lazy val alumni = lspace.ns.vocab.schema.alumni.property}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.EducationalOrganization.Properties{

override lazy val alumni = lspace.ns.vocab.schema.alumni.property}
}