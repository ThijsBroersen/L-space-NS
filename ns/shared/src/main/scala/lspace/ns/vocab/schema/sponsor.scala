package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object sponsor extends PropertyDef(
        iri = "http://schema.org/sponsor",
        iris = Set("http://schema.org/sponsor"),
        label = "sponsor",
        comment = """A person or organization that supports a thing through a pledge, promise, or financial contribution. e.g. a sponsor of a Medical Study or a corporate sponsor of an event.""",
        `@extends` = () => List(),
        `@range` = () => List(Organization.ontology, Person.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}