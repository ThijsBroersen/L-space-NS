package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object GameServerStatus extends OntologyDef(
        iri = "http://schema.org/GameServerStatus",
        iris = Set("http://schema.org/GameServerStatus"),
        label = "GameServerStatus",
        comment = """Status of a game server.""",
        `@extends` = () => List(Enumeration.ontology)
       ){
}