package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object mapType extends PropertyDef(
        iri = "http://schema.org/mapType",
        iris = Set("http://schema.org/mapType"),
        label = "mapType",
        comment = """Indicates the kind of Map, from the MapCategoryType Enumeration.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}