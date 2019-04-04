package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object geoDisjoint extends PropertyDef(
        iri = "https://schema.org/geoDisjoint",
        iris = Set("https://schema.org/geoDisjoint"),
        label = "geoDisjoint",
        comment = """Represents spatial relations in which two geometries (or the places they represent) are topologically disjoint: they have no point in common. They form a set of disconnected geometries." (a symmetric relationship, as defined in <a href="https://en.wikipedia.org/wiki/DE-9IM">DE-9IM</a>)""",
        `@extends` = () => List(),
        `@range` = () => List(Place.ontology)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}