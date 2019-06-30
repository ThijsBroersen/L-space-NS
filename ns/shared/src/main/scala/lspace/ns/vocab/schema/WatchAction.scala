package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object WatchAction extends OntologyDef(
        iri = "http://schema.org/WatchAction",
        iris = Set("http://schema.org/WatchAction"),
        label = "WatchAction",
        comment = """The act of consuming dynamic/moving visual content.""",
        `@extends` = () => List(ConsumeAction.ontology)
       ){
}