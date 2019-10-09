package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object latitude extends PropertyDef(
        iri = "http://schema.org/latitude",
        iris = Set("http://schema.org/latitude"),
        label = "latitude",
        comment = """The latitude of a location. For example <code>37.42242</code> (<a href="https://en.wikipedia.org/wiki/World_Geodetic_System">WGS 84</a>).""",
        `@extends` = List(),
        `@range` = List(`@number`, `@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}