package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object GamePlayMode extends OntologyDef(
        iri = "http://schema.org/GamePlayMode",
        iris = Set("http://schema.org/GamePlayMode"),
        label = "GamePlayMode",
        comment = """Indicates whether this game is multi-player, co-op or single-player.""",
        `@extends` = () => List(Enumeration.ontology)
       ){
}