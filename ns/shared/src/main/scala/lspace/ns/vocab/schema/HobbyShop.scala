package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object HobbyShop extends OntologyDef(
        iri = "http://schema.org/HobbyShop",
        iris = Set("http://schema.org/HobbyShop"),
        label = "HobbyShop",
        comment = """A store that sells materials useful or necessary for various hobbies.""",
        `@extends` = () => List(Store.ontology)
       ){
}