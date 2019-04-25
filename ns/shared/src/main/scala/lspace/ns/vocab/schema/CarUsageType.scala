package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object CarUsageType
    extends OntologyDef(
      iri = "http://schema.org/CarUsageType",
      iris = Set("http://schema.org/CarUsageType"),
      label = "CarUsageType",
      comment = """A value indicating a special usage of a car, e.g. commercial rental, driving school, or as a taxi.""",
      `@extends` = () => List(QualitativeValue.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.QualitativeValue.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.QualitativeValue.Properties {}
}
