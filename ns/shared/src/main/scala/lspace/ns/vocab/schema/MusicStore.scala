package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MusicStore extends OntologyDef(
        iri = "http://schema.org/MusicStore",
        iris = Set("http://schema.org/MusicStore"),
        label = "MusicStore",
        comment = """A music store.""",
        `@extends` = () => List(Store.ontology)
       ){
}