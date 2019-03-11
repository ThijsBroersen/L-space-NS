package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object geospatiallyCoveredBy extends PropertyDef(
        iri = "https://schema.org/geospatiallyCoveredBy",
        iris = Set("https://schema.org/geospatiallyCoveredBy"),
        label = "geospatiallyCoveredBy",
        comment = """Represents a relationship between two geometries (or the places they represent), relating a geometry to another that covers it. As defined in <a href="https://en.wikipedia.org/wiki/DE-9IM">DE-9IM</a>.""",
        `@extends` = () => List(),
        `@range` = () => List(Place)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}