package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Continent extends OntologyDef(
        iri = "http://schema.org/Continent",
        iris = Set("http://schema.org/Continent"),
        label = "Continent",
        comment = """One of the continents (for example, Europe or Africa).""",
        `@extends` = () => List(Landform.ontology)
       ){
}