package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object sdPublisher extends PropertyDef(
        iri = "https://schema.org/sdPublisher",
        iris = Set("https://schema.org/sdPublisher"),
        label = "sdPublisher",
        comment = """Indicates the party responsible for generating and publishing the current structured data markup, typically in cases where the structured data is derived automatically from existing published content but published on a different site. For example, student projects and open data initiatives often re-publish existing content with more explicitly structured metadata. The
<a class="localLink" href="http://schema.org/sdPublisher">sdPublisher</a> property helps make such practices more explicit.""",
        `@extends` = () => List(),
        `@range` = () => List(Person)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}