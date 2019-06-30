package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Enumeration extends OntologyDef(
        iri = "http://schema.org/Enumeration",
        iris = Set("http://schema.org/Enumeration"),
        label = "Enumeration",
        comment = """Lists or enumerations—for example, a list of cuisines or music genres, etc.""",
        `@extends` = () => List(Intangible.ontology)
       ){
}