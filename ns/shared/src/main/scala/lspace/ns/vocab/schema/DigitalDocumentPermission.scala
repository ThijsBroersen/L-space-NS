package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DigitalDocumentPermission extends OntologyDef(
        iri = "http://schema.org/DigitalDocumentPermission",
        iris = Set("http://schema.org/DigitalDocumentPermission"),
        label = "DigitalDocumentPermission",
        comment = """A permission for a particular person or group to access a particular file.""",
        `@extends` = () => List(Intangible.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val permissionType = lspace.ns.vocab.schema.permissionType.property
}
override lazy val properties: List[LProperty] = List(permissionType)
trait Properties extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val permissionType = lspace.ns.vocab.schema.permissionType.property
}
}