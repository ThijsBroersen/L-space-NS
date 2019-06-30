package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object CreativeWork extends OntologyDef(
        iri = "http://schema.org/CreativeWork",
        iris = Set("http://schema.org/CreativeWork"),
        label = "CreativeWork",
        comment = """The most generic kind of creative work, including books, movies, photographs, software programs, etc.""",
        `@extends` = () => List(Thing.ontology)
       ){
}