package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object volumeNumber extends PropertyDef(
        iri = "http://schema.org/volumeNumber",
        iris = Set("http://schema.org/volumeNumber"),
        label = "volumeNumber",
        comment = """Identifies the volume of publication or multi-part work; for example, "iii" or "2".""",
        `@extends` = List(position.property),
        `@range` = List(`@string`, `@int`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.position.Properties
}