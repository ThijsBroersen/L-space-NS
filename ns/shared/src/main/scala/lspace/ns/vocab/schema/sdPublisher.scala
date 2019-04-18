package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object sdPublisher extends PropertyDef(
        iri = "http://schema.org/sdPublisher",
        iris = Set("http://schema.org/sdPublisher"),
        label = "sdPublisher",
        comment = """Indicates the party responsible for generating and publishing the current structured data markup, typically in cases where the structured data is derived automatically from existing published content but published on a different site. For example, student projects and open data initiatives often re-publish existing content with more explicitly structured metadata. The
<a class="localLink" href="http://schema.org/sdPublisher">sdPublisher</a> property helps make such practices more explicit.""",
        `@extends` = () => List(),
        `@range` = () => List(Organization.ontology, Person.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}