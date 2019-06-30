package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PrependAction extends OntologyDef(
        iri = "http://schema.org/PrependAction",
        iris = Set("http://schema.org/PrependAction"),
        label = "PrependAction",
        comment = """The act of inserting at the beginning if an ordered collection.""",
        `@extends` = () => List(InsertAction.ontology)
       ){
}