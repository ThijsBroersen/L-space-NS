package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Person extends OntologyDef(
        iri = "http://schema.org/Person",
        iris = Set("http://schema.org/Person"),
        label = "Person",
        comment = """A person (alive, dead, undead, or fictional).""",
        `@extends` = () => List(Thing.ontology)
       ){
}