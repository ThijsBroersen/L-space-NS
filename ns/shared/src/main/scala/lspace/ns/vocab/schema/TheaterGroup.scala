package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object TheaterGroup extends OntologyDef(
        iri = "http://schema.org/TheaterGroup",
        iris = Set("http://schema.org/TheaterGroup"),
        label = "TheaterGroup",
        comment = """A theater group or company, for example, the Royal Shakespeare Company or Druid Theatre.""",
        `@extends` = () => List(PerformingGroup.ontology)
       ){
}