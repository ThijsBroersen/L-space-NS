package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object workPerformed extends PropertyDef(
        iri = "https://schema.org/workPerformed",
        iris = Set("https://schema.org/workPerformed"),
        label = "workPerformed",
        comment = """A work performed in some event, for example a play performed in a TheaterEvent.""",
        `@extends` = () => List(workFeatured),
        `@range` = () => List(CreativeWork)
       ){

override lazy val properties: List[Property] = List()
trait Properties extends lspace.ns.vocab.schema.workFeatured.Properties
}