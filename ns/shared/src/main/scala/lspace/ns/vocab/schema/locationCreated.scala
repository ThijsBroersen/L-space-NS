package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object locationCreated extends PropertyDef(
        iri = "http://schema.org/locationCreated",
        iris = Set("http://schema.org/locationCreated"),
        label = "locationCreated",
        comment = """The location where the CreativeWork was created, which may not be the same as the location depicted in the CreativeWork.""",
        `@extends` = () => List(),
        `@range` = () => List(Place.ontology)
       ){
}