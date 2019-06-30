package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Occupation extends OntologyDef(
        iri = "http://schema.org/Occupation",
        iris = Set("http://schema.org/Occupation"),
        label = "Occupation",
        comment = """A profession, may involve prolonged training and/or a formal qualification.""",
        `@extends` = () => List(Intangible.ontology)
       ){
}