package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object masthead extends PropertyDef(
        iri = "http://schema.org/masthead",
        iris = Set("http://schema.org/masthead"),
        label = "masthead",
        comment = """For a <a class="localLink" href="http://schema.org/NewsMediaOrganization">NewsMediaOrganization</a>, a link to the masthead page or a page listing top editorial management.""",
        `@extends` = List(publishingPrinciples.property),
        `@range` = List(CreativeWork.ontology, URL.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.publishingPrinciples.Properties
}