package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object MobileApplication
    extends OntologyDef(
      iri = "http://schema.org/MobileApplication",
      iris = Set("http://schema.org/MobileApplication"),
      label = "MobileApplication",
      comment = """A software application designed specifically to work well on a mobile device such as a telephone.""",
      `@extends` = () => List(SoftwareApplication.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.SoftwareApplication.Properties {
    lazy val carrierRequirements = lspace.ns.vocab.schema.carrierRequirements.property
  }
  override lazy val properties: List[Property] = List(carrierRequirements)
  trait Properties extends lspace.ns.vocab.schema.SoftwareApplication.Properties {
    lazy val carrierRequirements = lspace.ns.vocab.schema.carrierRequirements.property
  }
}
