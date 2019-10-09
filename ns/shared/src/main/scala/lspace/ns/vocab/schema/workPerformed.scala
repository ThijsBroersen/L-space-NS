package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object workPerformed extends PropertyDef(
        iri = "http://schema.org/workPerformed",
        iris = Set("http://schema.org/workPerformed"),
        label = "workPerformed",
        comment = """A work performed in some event, for example a play performed in a TheaterEvent.""",
        `@extends` = List(workFeatured.property),
        `@range` = List(CreativeWork.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.workFeatured.Properties
}