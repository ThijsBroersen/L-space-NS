package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object JewelryStore extends OntologyDef(
        iri = "http://schema.org/JewelryStore",
        iris = Set("http://schema.org/JewelryStore"),
        label = "JewelryStore",
        comment = """A jewelry store.""",
        `@extends` = () => List(Store.ontology)
       ){
}