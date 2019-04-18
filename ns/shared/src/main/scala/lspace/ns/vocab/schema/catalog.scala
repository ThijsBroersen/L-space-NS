package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object catalog extends PropertyDef(
        iri = "http://schema.org/catalog",
        iris = Set("http://schema.org/catalog"),
        label = "catalog",
        comment = """A data catalog which contains this dataset.""",
        `@extends` = () => List(),
        `@range` = () => List(DataCatalog.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}