package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object SubwayStation extends OntologyDef(
        iri = "http://schema.org/SubwayStation",
        iris = Set("http://schema.org/SubwayStation"),
        label = "SubwayStation",
        comment = """A subway station.""",
        `@extends` = () => List(CivicStructure.ontology)
       ){
}