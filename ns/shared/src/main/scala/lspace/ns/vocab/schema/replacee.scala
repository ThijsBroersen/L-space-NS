package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object replacee extends PropertyDef(
        iri = "http://schema.org/replacee",
        iris = Set("http://schema.org/replacee"),
        label = "replacee",
        comment = """A sub property of object. The object that is being replaced.""",
        `@extends` = () => List(`object`.property),
        `@range` = () => List(Thing.ontology)
       ){
}