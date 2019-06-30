package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object interactionStatistic extends PropertyDef(
        iri = "http://schema.org/interactionStatistic",
        iris = Set("http://schema.org/interactionStatistic"),
        label = "interactionStatistic",
        comment = """The number of interactions for the CreativeWork using the WebSite or SoftwareApplication. The most specific child type of InteractionCounter should be used.""",
        `@extends` = () => List(),
        `@range` = () => List(InteractionCounter.ontology)
       ){
}