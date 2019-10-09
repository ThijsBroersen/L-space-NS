package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object holdingArchive extends PropertyDef(
        iri = "http://schema.org/holdingArchive",
        iris = Set("http://schema.org/holdingArchive"),
        label = "holdingArchive",
        comment = """<a class="localLink" href="http://schema.org/ArchiveOrganization">ArchiveOrganization</a> that holds, keeps or maintains the <a class="localLink" href="http://schema.org/ArchiveComponent">ArchiveComponent</a>.""",
        `@extends` = List(),
        `@range` = List(ArchiveOrganization.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}