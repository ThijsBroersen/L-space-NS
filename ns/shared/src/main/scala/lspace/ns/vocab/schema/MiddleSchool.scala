package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MiddleSchool
    extends OntologyDef(
      iri = "http://schema.org/MiddleSchool",
      iris = Set("http://schema.org/MiddleSchool"),
      label = "MiddleSchool",
      comment = """A middle school (typically for children aged around 11-14, although this varies somewhat).""",
      `@extends` = () => List(EducationalOrganization.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.EducationalOrganization.Properties {

    override lazy val alumni = lspace.ns.vocab.schema.alumni.property
  }
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.EducationalOrganization.Properties {

    override lazy val alumni = lspace.ns.vocab.schema.alumni.property
  }
}
