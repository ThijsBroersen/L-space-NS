package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object workFeatured extends PropertyDef(
        iri = "https://schema.org/workFeatured",
        iris = Set("https://schema.org/workFeatured"),
        label = "workFeatured",
        comment = """A work featured in some event, e.g. exhibited in an ExhibitionEvent.
       Specific subproperties are available for workPerformed (e.g. a play), or a workPresented (a Movie at a ScreeningEvent).""",
        `@extends` = () => List(),
        `@range` = () => List(CreativeWork)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}