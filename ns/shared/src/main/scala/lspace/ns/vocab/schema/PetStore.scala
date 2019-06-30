package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PetStore extends OntologyDef(
        iri = "http://schema.org/PetStore",
        iris = Set("http://schema.org/PetStore"),
        label = "PetStore",
        comment = """A pet store.""",
        `@extends` = () => List(Store.ontology)
       ){
}