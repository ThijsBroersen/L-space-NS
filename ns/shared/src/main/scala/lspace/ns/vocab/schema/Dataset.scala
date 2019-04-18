package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Dataset extends OntologyDef(
        iri = "http://schema.org/Dataset",
        iris = Set("http://schema.org/Dataset"),
        label = "Dataset",
        comment = """A body of structured information describing some topic(s) of interest.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val distribution = lspace.ns.vocab.schema.distribution.property
lazy val includedInDataCatalog = lspace.ns.vocab.schema.includedInDataCatalog.property
lazy val issn = lspace.ns.vocab.schema.issn.property
lazy val includedDataCatalog = lspace.ns.vocab.schema.includedDataCatalog.property
lazy val catalog = lspace.ns.vocab.schema.catalog.property
lazy val measurementTechnique = lspace.ns.vocab.schema.measurementTechnique.property
lazy val datasetTimeInterval = lspace.ns.vocab.schema.datasetTimeInterval.property
}
override lazy val properties: List[LProperty] = List(distribution, includedInDataCatalog, issn, includedDataCatalog, catalog, measurementTechnique, datasetTimeInterval)
trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val distribution = lspace.ns.vocab.schema.distribution.property
lazy val includedInDataCatalog = lspace.ns.vocab.schema.includedInDataCatalog.property
lazy val issn = lspace.ns.vocab.schema.issn.property
lazy val includedDataCatalog = lspace.ns.vocab.schema.includedDataCatalog.property
lazy val catalog = lspace.ns.vocab.schema.catalog.property
lazy val measurementTechnique = lspace.ns.vocab.schema.measurementTechnique.property
lazy val datasetTimeInterval = lspace.ns.vocab.schema.datasetTimeInterval.property
}
}