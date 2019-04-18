package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object hasDigitalDocumentPermission extends PropertyDef(
        iri = "http://schema.org/hasDigitalDocumentPermission",
        iris = Set("http://schema.org/hasDigitalDocumentPermission"),
        label = "hasDigitalDocumentPermission",
        comment = """A permission related to the access to this document (e.g. permission to read or write an electronic document). For a public document, specify a grantee with an Audience with audienceType equal to "public".""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}