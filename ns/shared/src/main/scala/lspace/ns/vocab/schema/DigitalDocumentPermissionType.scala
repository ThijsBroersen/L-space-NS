package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DigitalDocumentPermissionType extends OntologyDef(
        iri = "http://schema.org/DigitalDocumentPermissionType",
        iris = Set("http://schema.org/DigitalDocumentPermissionType"),
        label = "DigitalDocumentPermissionType",
        comment = """A type of permission which can be granted for accessing a digital document.""",
        `@extends` = () => List(Enumeration.ontology)
       ){
}