package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object uploadDate extends PropertyDef(
        iri = "http://schema.org/uploadDate",
        iris = Set("http://schema.org/uploadDate"),
        label = "uploadDate",
        comment = """Date when this media object was uploaded to this site.""",
        `@extends` = List(),
        `@range` = List(`@date`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}