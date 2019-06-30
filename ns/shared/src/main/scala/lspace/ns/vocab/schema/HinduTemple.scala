package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object HinduTemple extends OntologyDef(
        iri = "http://schema.org/HinduTemple",
        iris = Set("http://schema.org/HinduTemple"),
        label = "HinduTemple",
        comment = """A Hindu temple.""",
        `@extends` = () => List(PlaceOfWorship.ontology)
       ){
}