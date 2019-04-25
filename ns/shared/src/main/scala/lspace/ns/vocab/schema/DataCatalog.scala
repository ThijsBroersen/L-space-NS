package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DataCatalog
    extends OntologyDef(
      iri = "http://schema.org/DataCatalog",
      iris = Set("http://schema.org/DataCatalog"),
      label = "DataCatalog",
      comment = """A collection of datasets.""",
      `@extends` = () => List(CreativeWork.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.CreativeWork.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties {}
}
