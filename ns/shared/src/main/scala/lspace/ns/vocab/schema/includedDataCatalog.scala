package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object includedDataCatalog extends PropertyDef(
        iri = "http://schema.org/includedDataCatalog",
        iris = Set("http://schema.org/includedDataCatalog"),
        label = "includedDataCatalog",
        comment = """A data catalog which contains this dataset (this property was previously 'catalog', preferred name is now 'includedInDataCatalog').""",
        `@extends` = () => List(),
        `@range` = () => List(DataCatalog.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}