package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object EndorseAction extends OntologyDef(
        iri = "http://schema.org/EndorseAction",
        iris = Set("http://schema.org/EndorseAction"),
        label = "EndorseAction",
        comment = """An agent approves/certifies/likes/supports/sanction an object.""",
        `@extends` = () => List(ReactAction.ontology)
       ){
}