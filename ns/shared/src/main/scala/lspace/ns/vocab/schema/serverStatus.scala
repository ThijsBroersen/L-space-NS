package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object serverStatus extends PropertyDef(
        iri = "http://schema.org/serverStatus",
        iris = Set("http://schema.org/serverStatus"),
        label = "serverStatus",
        comment = """Status of a game server.""",
        `@extends` = () => List(),
        `@range` = () => List(GameServerStatus.ontology)
       ){
}