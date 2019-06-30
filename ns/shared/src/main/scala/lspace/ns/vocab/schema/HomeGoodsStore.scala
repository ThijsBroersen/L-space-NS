package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object HomeGoodsStore extends OntologyDef(
        iri = "http://schema.org/HomeGoodsStore",
        iris = Set("http://schema.org/HomeGoodsStore"),
        label = "HomeGoodsStore",
        comment = """A home goods store.""",
        `@extends` = () => List(Store.ontology)
       ){
}