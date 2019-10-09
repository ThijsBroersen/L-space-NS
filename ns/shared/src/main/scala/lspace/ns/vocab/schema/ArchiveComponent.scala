package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ArchiveComponent extends OntologyDef(
        iri = "http://schema.org/ArchiveComponent",
        iris = Set("http://schema.org/ArchiveComponent"),
        label = "ArchiveComponent",
        comment = """An intangible type to be applied to any archive content, carrying with it a set of properties required to describe archival items and collections.""",
        `@extends` = List(CreativeWork.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val holdingArchive = lspace.ns.vocab.schema.holdingArchive.property
lazy val itemLocation = lspace.ns.vocab.schema.itemLocation.property
}
override lazy val properties: List[LProperty] = List(holdingArchive, itemLocation)
trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val holdingArchive = lspace.ns.vocab.schema.holdingArchive.property
lazy val itemLocation = lspace.ns.vocab.schema.itemLocation.property
}
}