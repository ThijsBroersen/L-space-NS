package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Dataset extends OntologyDef(
        iri = "http://schema.org/Dataset",
        iris = Set("http://schema.org/Dataset"),
        label = "Dataset",
        comment = """A body of structured information describing some topic(s) of interest.""",
        `@extends` = List(CreativeWork.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val distribution = lspace.ns.vocab.schema.distribution.property
lazy val includedInDataCatalog = lspace.ns.vocab.schema.includedInDataCatalog.property
lazy val issn = lspace.ns.vocab.schema.issn.property
lazy val measurementTechnique = lspace.ns.vocab.schema.measurementTechnique.property
lazy val variableMeasured = lspace.ns.vocab.schema.variableMeasured.property
}
override lazy val properties: List[LProperty] = List(distribution, includedInDataCatalog, issn, measurementTechnique, variableMeasured)
trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val distribution = lspace.ns.vocab.schema.distribution.property
lazy val includedInDataCatalog = lspace.ns.vocab.schema.includedInDataCatalog.property
lazy val issn = lspace.ns.vocab.schema.issn.property
lazy val measurementTechnique = lspace.ns.vocab.schema.measurementTechnique.property
lazy val variableMeasured = lspace.ns.vocab.schema.variableMeasured.property
}
}