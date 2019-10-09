package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object exifData extends PropertyDef(
        iri = "http://schema.org/exifData",
        iris = Set("http://schema.org/exifData"),
        label = "exifData",
        comment = """exif data for this object.""",
        `@extends` = List(),
        `@range` = List(PropertyValue.ontology, `@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}