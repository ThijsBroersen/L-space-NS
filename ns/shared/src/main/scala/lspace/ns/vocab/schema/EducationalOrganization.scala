package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object EducationalOrganization extends OntologyDef(
        iri = "http://schema.org/EducationalOrganization",
        iris = Set("http://schema.org/EducationalOrganization"),
        label = "EducationalOrganization",
        comment = """An educational organization.""",
        `@extends` = () => List(Organization.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Organization.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.Organization.Properties{

}
}