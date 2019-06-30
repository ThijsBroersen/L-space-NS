package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object SportingGoodsStore extends OntologyDef(
        iri = "http://schema.org/SportingGoodsStore",
        iris = Set("http://schema.org/SportingGoodsStore"),
        label = "SportingGoodsStore",
        comment = """A sporting goods store.""",
        `@extends` = () => List(Store.ontology)
       ){
}