package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object FMRadioChannel extends OntologyDef(
        iri = "http://schema.org/FMRadioChannel",
        iris = Set("http://schema.org/FMRadioChannel"),
        label = "FMRadioChannel",
        comment = """A radio channel that uses FM.""",
        `@extends` = () => List(RadioChannel.ontology)
       ){
}