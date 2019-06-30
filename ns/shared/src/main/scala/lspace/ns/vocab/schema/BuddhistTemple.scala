package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object BuddhistTemple extends OntologyDef(
        iri = "http://schema.org/BuddhistTemple",
        iris = Set("http://schema.org/BuddhistTemple"),
        label = "BuddhistTemple",
        comment = """A Buddhist temple.""",
        `@extends` = () => List(PlaceOfWorship.ontology)
       ){
}