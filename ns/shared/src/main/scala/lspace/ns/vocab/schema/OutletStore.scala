package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object OutletStore extends OntologyDef(
        iri = "http://schema.org/OutletStore",
        iris = Set("http://schema.org/OutletStore"),
        label = "OutletStore",
        comment = """An outlet store.""",
        `@extends` = () => List(Store.ontology)
       ){
}