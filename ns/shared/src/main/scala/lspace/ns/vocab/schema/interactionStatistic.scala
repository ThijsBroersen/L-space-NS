package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object interactionStatistic extends PropertyDef(
        iri = "https://schema.org/interactionStatistic",
        iris = Set("https://schema.org/interactionStatistic"),
        label = "interactionStatistic",
        comment = """The number of interactions for the CreativeWork using the WebSite or SoftwareApplication. The most specific child type of InteractionCounter should be used.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}