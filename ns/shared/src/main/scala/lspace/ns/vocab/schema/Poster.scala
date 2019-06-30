package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Poster extends OntologyDef(
        iri = "http://schema.org/Poster",
        iris = Set("http://schema.org/Poster"),
        label = "Poster",
        comment = """A large, usually printed placard, bill, or announcement, often illustrated, that is posted to advertise or publicize something.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
}