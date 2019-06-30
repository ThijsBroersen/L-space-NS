package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object RestrictedDiet extends OntologyDef(
        iri = "http://schema.org/RestrictedDiet",
        iris = Set("http://schema.org/RestrictedDiet"),
        label = "RestrictedDiet",
        comment = """A diet restricted to certain foods or preparations for cultural, religious, health or lifestyle reasons.""",
        `@extends` = () => List(Enumeration.ontology)
       ){
}