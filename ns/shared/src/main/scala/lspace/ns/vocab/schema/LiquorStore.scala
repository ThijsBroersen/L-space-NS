package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object LiquorStore extends OntologyDef(
        iri = "http://schema.org/LiquorStore",
        iris = Set("http://schema.org/LiquorStore"),
        label = "LiquorStore",
        comment = """A shop that sells alcoholic drinks such as wine, beer, whisky and other spirits.""",
        `@extends` = () => List(Store.ontology)
       ){
}