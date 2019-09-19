package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object archiveHeld extends PropertyDef(
        iri = "http://schema.org/archiveHeld",
        iris = Set("http://schema.org/archiveHeld"),
        label = "archiveHeld",
        comment = """Collection, <a href="https://en.wikipedia.org/wiki/Fonds">fonds</a>, or item held, kept or maintained by an <a class="localLink" href="http://schema.org/ArchiveOrganization">ArchiveOrganization</a>.""",
        `@extends` = () => List(),
        `@range` = () => List(ArchiveComponent.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}