package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ArchiveComponent extends OntologyDef(
        iri = "http://schema.org/ArchiveComponent",
        iris = Set("http://schema.org/ArchiveComponent"),
        label = "ArchiveComponent",
        comment = """An intangible type to be applied to any archive content, carrying with it a set of properties required to describe archival items and collections.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
}