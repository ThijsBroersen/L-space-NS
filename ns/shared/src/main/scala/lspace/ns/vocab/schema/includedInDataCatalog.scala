package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object includedInDataCatalog extends PropertyDef(
        iri = "http://schema.org/includedInDataCatalog",
        iris = Set("http://schema.org/includedInDataCatalog"),
        label = "includedInDataCatalog",
        comment = """A data catalog which contains this dataset.""",
        `@extends` = List(),
        `@range` = List(DataCatalog.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}