package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object deathPlace extends PropertyDef(
        iri = "http://schema.org/deathPlace",
        iris = Set("http://schema.org/deathPlace"),
        label = "deathPlace",
        comment = """The place where the person died.""",
        `@extends` = () => List(),
        `@range` = () => List(Place.ontology)
       ){
}